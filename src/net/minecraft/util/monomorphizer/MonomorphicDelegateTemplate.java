package net.minecraft.util.monomorphizer;

import java.io.IOException;
import java.io.InputStream;
import java.lang.classfile.ClassBuilder;
import java.lang.classfile.ClassElement;
import java.lang.classfile.ClassFile;
import java.lang.classfile.ClassHierarchyResolver;
import java.lang.classfile.ClassModel;
import java.lang.classfile.ClassTransform;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.CodeElement;
import java.lang.classfile.Instruction;
import java.lang.classfile.MethodModel;
import java.lang.classfile.MethodTransform;
import java.lang.classfile.Opcode;
import java.lang.classfile.TypeKind;
import java.lang.classfile.ClassFile.ClassHierarchyResolverOption;
import java.lang.classfile.constantpool.ConstantDynamicEntry;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.instruction.InvokeInstruction;
import java.lang.classfile.instruction.LoadInstruction;
import java.lang.classfile.instruction.LocalVariable;
import java.lang.classfile.instruction.LocalVariableType;
import java.lang.classfile.instruction.StoreInstruction;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.DynamicConstantDesc;
import java.lang.constant.MethodTypeDesc;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.lang.reflect.AccessFlag;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.SharedConstants;

record MonomorphicDelegateTemplate<Target>(byte[] classBytes) {
   private static final MethodType CONSTRUCTOR_TYPE = MethodType.methodType(void.class);

   public static <Target> MonomorphicDelegateTemplate<Target> createTemplate(final Class<Target> targetClass) {
      validateTargetClass(targetClass);
      ClassModel targetClassModel = ClassFile.of().parse(loadClassBytes(targetClass));
      validateTargetClassModel(targetClassModel);
      byte[] transformedClassBytes = transformClassToDelegate(targetClassModel, targetClass.getClassLoader());
      if (SharedConstants.DEBUG_DUMP_RUNTIME_MONOMORPHIC_CLASSES) {
         try {
            Path path = Path.of("monomorphizer", targetClass.getName() + ".class");
            Files.createDirectories(path.getParent());
            Files.write(path, transformedClassBytes);
         } catch (IOException e) {
            throw new RuntimeException(e);
         }
      }

      return new MonomorphicDelegateTemplate<>(transformedClassBytes);
   }

   private static void validateTargetClass(final Class<?> targetClass) {
      if (targetClass.isHidden()) {
         throw new IllegalArgumentException(targetClass + " may not be hidden");
      }

      if (!targetClass.isRecord()) {
         throw new IllegalArgumentException(targetClass + " must be a record");
      }

      Stream<Class<?>> innerClasses = Arrays.stream(targetClass.getNestMembers()).filter(nestMember -> targetClass.equals(nestMember.getEnclosingClass()));
      List<Class<?>> instanceInnerClasses = innerClasses.filter(innerClass -> (innerClass.getModifiers() & 8) == 0).toList();
      if (!instanceInnerClasses.isEmpty()) {
         throw new IllegalArgumentException(targetClass + " has non-static inner classes: " + instanceInnerClasses);
      }
   }

   private static void validateTargetClassModel(final ClassModel model) {
      for (MethodModel method : model.methods()) {
         boolean hasSuperInvoke = hasAnyInstructionMatching(
            method,
            instruction -> instruction instanceof InvokeInstruction invoke
               && invoke.opcode() == Opcode.INVOKESPECIAL
               && !invoke.method().name().equalsString("<init>")
         );
         if (hasSuperInvoke) {
            throw new IllegalArgumentException(model.thisClass().asInternalName() + " may not use super. calls");
         }
      }
   }

   private static boolean hasAnyInstructionMatching(final MethodModel method, final Predicate<Instruction> predicate) {
      return method.code()
         .map(code -> code.elementStream().anyMatch(element -> element instanceof Instruction instruction && predicate.test(instruction)))
         .orElse(false);
   }

   private static byte[] loadClassBytes(final Class<?> clazz) {
      String path = "/" + clazz.getName().replace('.', '/') + ".class";

      try (InputStream input = clazz.getResourceAsStream(path)) {
         if (input == null) {
            throw new IllegalArgumentException("Could not find resource for class " + clazz + " at " + path);
         } else {
            return input.readAllBytes();
         }
      } catch (IOException e) {
         throw new IllegalArgumentException("Could not load bytes for class " + clazz + " at " + path, e);
      }
   }

   private static byte[] transformClassToDelegate(final ClassModel targetClassModel, final ClassLoader targetClassLoader) {
      ClassDesc targetClassDesc = targetClassModel.thisClass().asSymbol();
      ClassDesc thisClassDesc = ClassDesc.of(targetClassDesc.packageName(), "$MonomorphicDelegate$" + targetClassDesc.displayName());
      ConstantPoolBuilder constantPool = ConstantPoolBuilder.of(targetClassModel);
      ConstantDynamicEntry targetInstanceCondy = constantPool.constantDynamicEntry(
         DynamicConstantDesc.ofNamed(ConstantDescs.BSM_CLASS_DATA, "_", targetClassDesc)
      );
      MonomorphicDelegateTemplate.DelegateClassTransform transform = new MonomorphicDelegateTemplate.DelegateClassTransform(
         thisClassDesc, targetClassDesc, targetInstanceCondy
      );
      ClassHierarchyResolver classHierarchyResolver = ClassHierarchyResolver.ofClassLoading(targetClassLoader);
      return ClassFile.of().withOptions(ClassHierarchyResolverOption.of(classHierarchyResolver)).transformClass(targetClassModel, thisClassDesc, transform);
   }

   public GeneratedDelegate create(final Lookup lookup, final Target target) {
      try {
         Lookup newLookup = lookup.defineHiddenClassWithClassData(this.classBytes, target, true, ClassOption.NESTMATE);
         return (GeneratedDelegate)newLookup.findConstructor(newLookup.lookupClass(), CONSTRUCTOR_TYPE).invoke();
      } catch (Throwable e) {
         throw new IllegalStateException("Failed to create monomorphic delegate for: " + target, e);
      }
   }

   private static final class DelegateClassTransform implements ClassTransform {
      private static final ClassDesc CD_GENERATED_DELEGATE = GeneratedDelegate.class.describeConstable().orElseThrow();
      private final ClassDesc thisClassDesc;
      private final ClassDesc targetClassDesc;
      private final ConstantDynamicEntry targetInstanceCondy;
      private final Set<MonomorphicDelegateTemplate.DelegateClassTransform.DispatcherStub> usedDispatcherStubs = new HashSet<>();

      public DelegateClassTransform(final ClassDesc thisClassDesc, final ClassDesc targetClassDesc, final ConstantDynamicEntry targetInstanceCondy) {
         this.thisClassDesc = thisClassDesc;
         this.targetClassDesc = targetClassDesc;
         this.targetInstanceCondy = targetInstanceCondy;
      }

      public void accept(final ClassBuilder builder, final ClassElement element) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.IllegalStateException: Invalid switch case set: [[var2_1 instanceof var6_1, const(2)], [var2_1 instanceof var7_1], [var2_1 instanceof method], [null]] for selector of type Ljava/lang/classfile/ClassElement;
         //   at org.jetbrains.java.decompiler.modules.decompiler.exps.SwitchHeadExprent.checkExprTypeBounds(SwitchHeadExprent.java:63)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.checkTypeExpr(VarTypeProcessor.java:156)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.checkTypeExprent(VarTypeProcessor.java:137)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.lambda$processVarTypes$2(VarTypeProcessor.java:125)
         //   at org.jetbrains.java.decompiler.modules.decompiler.flow.DirectGraph.iterateExprents(DirectGraph.java:114)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.processVarTypes(VarTypeProcessor.java:125)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarTypeProcessor.calculateVarTypes(VarTypeProcessor.java:44)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarVersionsProcessor.setVarVersions(VarVersionsProcessor.java:68)
         //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.setVarVersions(VarProcessor.java:47)
         //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:320)
         //
         // Bytecode:
         // 00: aload 2
         // 01: dup
         // 02: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
         // 05: pop
         // 06: astore 3
         // 07: bipush 0
         // 08: istore 4
         // 0a: aload 3
         // 0b: iload 4
         // 0d: invokedynamic typeSwitch (Ljava/lang/classfile/ClassElement;I)I bsm=java/lang/runtime/SwitchBootstraps.typeSwitch (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ java/lang/classfile/attribute/RecordAttribute, java/lang/classfile/Superclass, java/lang/classfile/FieldModel, java/lang/classfile/MethodModel ]
         // 12: tableswitch 65 0 3 30 33 46 49
         // 30: goto 5b
         // 33: aload 1
         // 34: getstatic net/minecraft/util/monomorphizer/MonomorphicDelegateTemplate$DelegateClassTransform.CD_GENERATED_DELEGATE Ljava/lang/constant/ClassDesc;
         // 37: invokeinterface java/lang/classfile/ClassBuilder.withSuperclass (Ljava/lang/constant/ClassDesc;)Ljava/lang/classfile/ClassBuilder; 2
         // 3c: pop
         // 3d: goto 5b
         // 40: goto 5b
         // 43: aload 3
         // 44: checkcast java/lang/classfile/MethodModel
         // 47: astore 5
         // 49: aload 0
         // 4a: aload 1
         // 4b: aload 5
         // 4d: invokevirtual net/minecraft/util/monomorphizer/MonomorphicDelegateTemplate$DelegateClassTransform.acceptMethod (Ljava/lang/classfile/ClassBuilder;Ljava/lang/classfile/MethodModel;)V
         // 50: goto 5b
         // 53: aload 1
         // 54: aload 2
         // 55: invokeinterface java/lang/classfile/ClassBuilder.with (Ljava/lang/classfile/ClassFileElement;)Ljava/lang/classfile/ClassFileBuilder; 2
         // 5a: pop
         // 5b: return
      }

      private void acceptMethod(final ClassBuilder builder, final MethodModel method) {
         String methodName = method.methodName().stringValue();
         MethodTypeDesc methodDesc = method.methodTypeSymbol();
         if (!methodName.equals("<init>") && !methodName.equals("<clinit>")) {
            if (method.flags().has(AccessFlag.STATIC)) {
               builder.with(method);
            } else if (!methodName.equals("equals") || methodDesc.parameterCount() != 1 || !methodDesc.parameterType(0).equals(ConstantDescs.CD_Object)) {
               if (!methodName.equals("hashCode") || methodDesc.parameterCount() != 0) {
                  if (!methodName.equals("toString") || methodDesc.parameterCount() != 0) {
                     builder.transformMethod(method, MethodTransform.transformingCode(this::transformCodeElement));
                  }
               }
            }
         }
      }

      private void transformCodeElement(final CodeBuilder code, final CodeElement element) {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.RuntimeException: invalid constant type: Ljava/lang/classfile/CodeElement; with value 4
         //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ConstExprent.toJava(ConstExprent.java:364)
         //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SwitchStatement.toJava(SwitchStatement.java:169)
         //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
         //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1351)
         //
         // Bytecode:
         // 00: aload 2
         // 01: dup
         // 02: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
         // 05: pop
         // 06: astore 3
         // 07: bipush 0
         // 08: istore 4
         // 0a: aload 3
         // 0b: iload 4
         // 0d: invokedynamic typeSwitch (Ljava/lang/classfile/CodeElement;I)I bsm=java/lang/runtime/SwitchBootstraps.typeSwitch (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ java/lang/classfile/instruction/LoadInstruction, java/lang/classfile/instruction/StoreInstruction, java/lang/classfile/instruction/InvokeInstruction, java/lang/classfile/instruction/LocalVariable, java/lang/classfile/instruction/LocalVariableType ]
         // 12: tableswitch 189 0 4 34 76 122 163 163
         // 34: aload 3
         // 35: checkcast java/lang/classfile/instruction/LoadInstruction
         // 38: astore 5
         // 3a: aload 5
         // 3c: invokeinterface java/lang/classfile/instruction/LoadInstruction.slot ()I 1
         // 41: aload 1
         // 42: invokeinterface java/lang/classfile/CodeBuilder.receiverSlot ()I 1
         // 47: if_icmpeq 50
         // 4a: bipush 1
         // 4b: istore 4
         // 4d: goto 0a
         // 50: aload 1
         // 51: aload 0
         // 52: getfield net/minecraft/util/monomorphizer/MonomorphicDelegateTemplate$DelegateClassTransform.targetInstanceCondy Ljava/lang/classfile/constantpool/ConstantDynamicEntry;
         // 55: invokeinterface java/lang/classfile/CodeBuilder.ldc (Ljava/lang/classfile/constantpool/LoadableConstantEntry;)Ljava/lang/classfile/CodeBuilder; 2
         // 5a: pop
         // 5b: goto da
         // 5e: aload 3
         // 5f: checkcast java/lang/classfile/instruction/StoreInstruction
         // 62: astore 6
         // 64: aload 6
         // 66: invokeinterface java/lang/classfile/instruction/StoreInstruction.slot ()I 1
         // 6b: aload 1
         // 6c: invokeinterface java/lang/classfile/CodeBuilder.receiverSlot ()I 1
         // 71: if_icmpeq 7a
         // 74: bipush 2
         // 75: istore 4
         // 77: goto 0a
         // 7a: new java/lang/IllegalStateException
         // 7d: dup
         // 7e: aload 6
         // 80: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
         // 83: invokedynamic makeConcatWithConstants (Ljava/lang/String;)Ljava/lang/String; bsm=java/lang/invoke/StringConcatFactory.makeConcatWithConstants (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; args=[ "Encountered store to receiver slot (how?): \u0001" ]
         // 88: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
         // 8b: athrow
         // 8c: aload 3
         // 8d: checkcast java/lang/classfile/instruction/InvokeInstruction
         // 90: astore 7
         // 92: aload 7
         // 94: invokeinterface java/lang/classfile/instruction/InvokeInstruction.owner ()Ljava/lang/classfile/constantpool/ClassEntry; 1
         // 99: aload 0
         // 9a: getfield net/minecraft/util/monomorphizer/MonomorphicDelegateTemplate$DelegateClassTransform.targetClassDesc Ljava/lang/constant/ClassDesc;
         // 9d: invokeinterface java/lang/classfile/constantpool/ClassEntry.matches (Ljava/lang/constant/ClassDesc;)Z 2
         // a2: ifne ab
         // a5: bipush 3
         // a6: istore 4
         // a8: goto 0a
         // ab: aload 0
         // ac: aload 1
         // ad: aload 7
         // af: invokevirtual net/minecraft/util/monomorphizer/MonomorphicDelegateTemplate$DelegateClassTransform.transformInvokeOnThisType (Ljava/lang/classfile/CodeBuilder;Ljava/lang/classfile/instruction/InvokeInstruction;)V
         // b2: goto da
         // b5: aload 3
         // b6: instanceof java/lang/classfile/instruction/LocalVariable
         // b9: ifeq bf
         // bc: goto da
         // bf: aload 3
         // c0: instanceof java/lang/classfile/instruction/LocalVariableType
         // c3: ifeq c9
         // c6: goto da
         // c9: bipush 5
         // ca: istore 4
         // cc: goto 0a
         // cf: aload 1
         // d0: aload 2
         // d1: invokeinterface java/lang/classfile/CodeBuilder.with (Ljava/lang/classfile/ClassFileElement;)Ljava/lang/classfile/ClassFileBuilder; 2
         // d6: pop
         // d7: goto da
         // da: return
      }

      private void transformInvokeOnThisType(final CodeBuilder code, final InvokeInstruction invoke) {
         String methodName = invoke.name().stringValue();
         MethodTypeDesc methodDesc = invoke.typeSymbol();
         if (invoke.opcode() == Opcode.INVOKESTATIC) {
            code.invokestatic(this.thisClassDesc, methodName, methodDesc);
         } else if (methodName.equals("<init>")) {
            code.with(invoke);
         } else {
            this.invokeDispatcher(code, methodName, methodDesc);
         }
      }

      private void invokeDispatcher(final CodeBuilder code, final String methodName, final MethodTypeDesc methodDesc) {
         MonomorphicDelegateTemplate.DelegateClassTransform.DispatcherStub stub = new MonomorphicDelegateTemplate.DelegateClassTransform.DispatcherStub(
            methodName, methodDesc
         );
         this.usedDispatcherStubs.add(stub);
         code.aload(code.receiverSlot());
         code.invokestatic(this.thisClassDesc, stub.dispatcherName(), stub.dispatcherDesc(this.targetClassDesc));
      }

      public void atEnd(final ClassBuilder builder) {
         for (MonomorphicDelegateTemplate.DelegateClassTransform.DispatcherStub stub : this.usedDispatcherStubs) {
            this.buildDispatcher(builder, stub);
         }

         builder.withMethodBody("<init>", MethodTypeDesc.of(ConstantDescs.CD_void), AccessFlag.PUBLIC.mask(), code -> {
            code.aload(code.receiverSlot());
            code.ldc(this.targetInstanceCondy);
            code.invokespecial(CD_GENERATED_DELEGATE, "<init>", MethodTypeDesc.of(ConstantDescs.CD_void, ConstantDescs.CD_Object));
            code.return_();
         });
      }

      private void buildDispatcher(final ClassBuilder builder, final MonomorphicDelegateTemplate.DelegateClassTransform.DispatcherStub stub) {
         String targetName = stub.targetName();
         MethodTypeDesc targetDesc = stub.targetDesc();
         MethodTypeDesc dispatcherDesc = stub.dispatcherDesc(this.targetClassDesc);
         builder.withMethodBody(stub.dispatcherName(), dispatcherDesc, AccessFlag.PRIVATE.mask() | AccessFlag.STATIC.mask(), code -> {
            code.aload(code.parameterSlot(0));
            code.ldc(this.targetInstanceCondy);
            code.ifThenElse(Opcode.IF_ACMPEQ, ifCode -> {
               ifCode.aload(ifCode.parameterSlot(dispatcherDesc.parameterCount() - 1));
               ifCode.checkcast(this.thisClassDesc);
               loadParameters(ifCode, 1, targetDesc);
               ifCode.invoke(Opcode.INVOKEVIRTUAL, this.thisClassDesc, targetName, targetDesc, false);
            }, elseCode -> {
               elseCode.aload(elseCode.parameterSlot(0));
               loadParameters(elseCode, 1, targetDesc);
               elseCode.invoke(Opcode.INVOKEVIRTUAL, this.targetClassDesc, targetName, targetDesc, false);
            });
            code.return_(asTypeKind(targetDesc.returnType()));
         });
      }

      private static void loadParameters(final CodeBuilder code, final int baseIndex, final MethodTypeDesc targetDesc) {
         for (int i = 0; i < targetDesc.parameterCount(); i++) {
            ClassDesc parameterDesc = targetDesc.parameterType(i);
            code.loadLocal(asTypeKind(parameterDesc), code.parameterSlot(i + baseIndex));
         }
      }

      private static TypeKind asTypeKind(final ClassDesc typeDesc) {
         if (typeDesc.isClassOrInterface() || typeDesc.isArray()) {
            return TypeKind.REFERENCE;
         } else if (typeDesc == ConstantDescs.CD_boolean) {
            return TypeKind.BOOLEAN;
         } else if (typeDesc == ConstantDescs.CD_byte) {
            return TypeKind.BYTE;
         } else if (typeDesc == ConstantDescs.CD_char) {
            return TypeKind.CHAR;
         } else if (typeDesc == ConstantDescs.CD_short) {
            return TypeKind.SHORT;
         } else if (typeDesc == ConstantDescs.CD_int) {
            return TypeKind.INT;
         } else if (typeDesc == ConstantDescs.CD_long) {
            return TypeKind.LONG;
         } else if (typeDesc == ConstantDescs.CD_float) {
            return TypeKind.FLOAT;
         } else if (typeDesc == ConstantDescs.CD_double) {
            return TypeKind.DOUBLE;
         } else if (typeDesc == ConstantDescs.CD_void) {
            return TypeKind.VOID;
         } else {
            throw new UnsupportedOperationException("Unsupported type: " + typeDesc);
         }
      }

      private record DispatcherStub(String targetName, MethodTypeDesc targetDesc) {
         public String dispatcherName() {
            return "dispatcher$" + this.targetName;
         }

         public MethodTypeDesc dispatcherDesc(final ClassDesc targetClassDesc) {
            return this.targetDesc.insertParameterTypes(this.targetDesc.parameterCount(), ConstantDescs.CD_Object).insertParameterTypes(0, targetClassDesc);
         }
      }
   }
}
