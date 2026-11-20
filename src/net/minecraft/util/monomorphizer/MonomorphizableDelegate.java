package net.minecraft.util.monomorphizer;

import com.google.common.reflect.TypeToken;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.AccessFlag;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.minecraft.SharedConstants;

public abstract class MonomorphizableDelegate<Interface, Target extends Interface> {
   private static final ConcurrentMap<Class<?>, MonomorphicDelegateTemplate<?>> TEMPLATES = new ConcurrentHashMap<>();
   protected final Target target;
   private final MonomorphicDelegateTemplate<Target> delegateTemplate;

   protected MonomorphizableDelegate(final Target target) {
      this.target = target;
      this.delegateTemplate = (MonomorphicDelegateTemplate<Target>)TEMPLATES.computeIfAbsent(
         this.getClass(), MonomorphizableDelegate::validateAndCreateTemplate
      );
   }

   private static MonomorphicDelegateTemplate<?> validateAndCreateTemplate(final Class<?> delegateClass) {
      if ((delegateClass.getModifiers() & 16) == 0) {
         throw new IllegalStateException(delegateClass + " must be final");
      }

      Type superclass = delegateClass.getGenericSuperclass();
      if (superclass instanceof ParameterizedType parameterizedSuperclass) {
         Type[] typeParameters = parameterizedSuperclass.getActualTypeArguments();
         Class interfaceClass = TypeToken.of(typeParameters[0]).getRawType();
         Class targetClass = TypeToken.of(typeParameters[1]).getRawType();
         if (interfaceClass.isInterface() && interfaceClass.isAssignableFrom(delegateClass)) {
            validateReferenceDelegate(delegateClass, interfaceClass);
            return MonomorphicDelegateTemplate.createTemplate(targetClass);
         } else {
            throw new IllegalStateException(delegateClass + " must implement " + interfaceClass + " as an interface");
         }
      } else {
         throw new IllegalStateException(delegateClass + " does not parameterize " + superclass);
      }
   }

   private static void validateReferenceDelegate(final Class<?> delegateClass, final Class<?> interfaceClass) {
      for (Method interfaceMethod : interfaceClass.getMethods()) {
         if (interfaceMethod.getDeclaringClass() != Object.class
            && !interfaceMethod.accessFlags().contains(AccessFlag.STATIC)
            && Arrays.stream(delegateClass.getDeclaredMethods())
               .noneMatch(
                  method -> method.getName().equals(interfaceMethod.getName())
                     && method.getReturnType() == interfaceMethod.getReturnType()
                     && Arrays.equals(method.getParameterTypes(), interfaceMethod.getParameterTypes())
               )) {
            throw new IllegalStateException(delegateClass + " must implement " + interfaceMethod);
         }
      }
   }

   public Interface asInterface() {
      return (Interface)this;
   }

   public Interface makeMonomorphic(final Lookup lookup) {
      if (SharedConstants.DEBUG_DISABLE_RUNTIME_MONOMORPHIZATION) {
         return this.asInterface();
      } else if (!lookup.lookupClass().isNestmateOf(this.target.getClass())) {
         throw new IllegalArgumentException("lookup must be a nestmate of " + this.target.getClass());
      } else {
         return (Interface)this.delegateTemplate.create(lookup, this.target);
      }
   }

   @Override
   public final boolean equals(final Object obj) {
      return super.equals(obj);
   }

   @Override
   public final int hashCode() {
      return super.hashCode();
   }

   @Override
   public final String toString() {
      return "MonomorphizableDelegate[" + this.target + "]";
   }
}
