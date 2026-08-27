import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

public interface gcr<T> {
   static <T> gcr<T> a() {
      return $$0 -> List.of();
   }

   static <T> gcr<T> a(List<T> $$0, Function<T, Stream<String>> $$1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.NullPointerException: Cannot invoke "org.jetbrains.java.decompiler.struct.gen.VarType.equals(Object)" because "curType" is null
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.setLambdaGenericTypes(NewExprent.java:668)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.NewExprent.toJava(NewExprent.java:401)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1018)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ExitExprent.toJava(ExitExprent.java:86)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.listToJava(ExprProcessor.java:895)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.BasicBlockStatement.toJava(BasicBlockStatement.java:90)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:833)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.SequenceStatement.toJava(SequenceStatement.java:107)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.jmpWrapper(ExprProcessor.java:833)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.IfStatement.toJava(IfStatement.java:261)
      //   at org.jetbrains.java.decompiler.modules.decompiler.stats.RootStatement.toJava(RootStatement.java:36)
      //   at org.jetbrains.java.decompiler.main.ClassWriter.writeMethod(ClassWriter.java:1283)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokeinterface java/util/List.isEmpty ()Z 1
      // 06: ifeq 0d
      // 09: invokestatic gcr.a ()Lgcr;
      // 0c: areturn
      // 0d: new gcw
      // 10: dup
      // 11: invokespecial gcw.<init> ()V
      // 14: astore 2
      // 15: aload 0
      // 16: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 1b: astore 3
      // 1c: aload 3
      // 1d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 22: ifeq 48
      // 25: aload 3
      // 26: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2b: astore 4
      // 2d: aload 1
      // 2e: aload 4
      // 30: invokeinterface java/util/function/Function.apply (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 35: checkcast java/util/stream/Stream
      // 38: aload 2
      // 39: aload 4
      // 3b: invokedynamic accept (Lgcw;Ljava/lang/Object;)Ljava/util/function/Consumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)V, gcr.a (Lgcw;Ljava/lang/Object;Ljava/lang/String;)V, (Ljava/lang/String;)V ]
      // 40: invokeinterface java/util/stream/Stream.forEach (Ljava/util/function/Consumer;)V 2
      // 45: goto 1c
      // 48: aload 2
      // 49: invokevirtual gcw.a ()V
      // 4c: aload 2
      // 4d: dup
      // 4e: invokestatic java/util/Objects.requireNonNull (Ljava/lang/Object;)Ljava/lang/Object;
      // 51: pop
      // 52: invokedynamic search (Lgcw;)Lgcr; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/String;)Ljava/util/List;, gcw.a (Ljava/lang/String;)Ljava/util/List;, (Ljava/lang/String;)Ljava/util/List; ]
      // 57: areturn
   }

   List<T> search(String var1);
}
