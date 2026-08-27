import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class pu {
   private static final Collection<qj> a = Lists.newArrayList();
   private static final Set<String> b = Sets.newHashSet();
   private static final Map<String, Consumer<aki>> c = Maps.newHashMap();
   private static final Map<String, Consumer<aki>> d = Maps.newHashMap();
   private static final Collection<qj> e = Sets.newHashSet();

   public static void a(Class<?> $$0) {
      Arrays.stream($$0.getDeclaredMethods()).forEach(pu::a);
   }

   public static void a(Method $$0) {
      String $$1 = $$0.getDeclaringClass().getSimpleName();
      pk $$2 = $$0.getAnnotation(pk.class);
      if ($$2 != null) {
         a.add(c($$0));
         b.add($$1);
      }

      pq $$3 = $$0.getAnnotation(pq.class);
      if ($$3 != null) {
         a.addAll(b($$0));
         b.add($$1);
      }

      a($$0, pi.class, pi::a, c);
      a($$0, ph.class, ph::a, d);
   }

   private static <T extends Annotation> void a(Method $$0, Class<T> $$1, Function<T, String> $$2, Map<String, Consumer<aki>> $$3) {
      T $$4 = $$0.getAnnotation($$1);
      if ($$4 != null) {
         String $$5 = $$2.apply($$4);
         Consumer<aki> $$6 = $$3.putIfAbsent($$5, (Consumer<aki>)d($$0));
         if ($$6 != null) {
            throw new RuntimeException("Hey, there should only be one " + $$1 + " method per batch. Batch '" + $$5 + "' has more than one!");
         }
      }
   }

   public static Collection<qj> a(String $$0) {
      return a.stream().filter($$1 -> a($$1, $$0)).collect(Collectors.toList());
   }

   public static Collection<qj> a() {
      return a;
   }

   public static Collection<String> b() {
      return b;
   }

   public static boolean b(String $$0) {
      return b.contains($$0);
   }

   @Nullable
   public static Consumer<aki> c(String $$0) {
      return c.get($$0);
   }

   @Nullable
   public static Consumer<aki> d(String $$0) {
      return d.get($$0);
   }

   public static Optional<qj> e(String $$0) {
      return a().stream().filter($$1 -> $$1.a().equalsIgnoreCase($$0)).findFirst();
   }

   public static qj f(String $$0) {
      Optional<qj> $$1 = e($$0);
      if (!$$1.isPresent()) {
         throw new IllegalArgumentException("Can't find the test function for " + $$0);
      } else {
         return $$1.get();
      }
   }

   private static Collection<qj> b(Method $$0) {
      try {
         Object $$1 = $$0.getDeclaringClass().newInstance();
         return (Collection<qj>)$$0.invoke($$1);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException(var2);
      }
   }

   private static qj c(Method $$0) {
      pk $$1 = $$0.getAnnotation(pk.class);
      String $$2 = $$0.getDeclaringClass().getSimpleName();
      String $$3 = $$2.toLowerCase();
      String $$4 = $$3 + "." + $$0.getName().toLowerCase();
      String $$5 = $$1.e().isEmpty() ? $$4 : $$3 + "." + $$1.e();
      String $$6 = $$1.b();
      cyw $$7 = qf.a($$1.c());
      return new qj($$6, $$4, $$5, $$7, $$1.a(), $$1.f(), $$1.d(), $$1.h(), $$1.g(), (Consumer<pr>)d($$0));
   }

   private static Consumer<?> d(Method $$0) {
      return $$1 -> {
         try {
            Object $$2 = $$0.getDeclaringClass().newInstance();
            $$0.invoke($$2, $$1);
         } catch (InvocationTargetException var3) {
            if (var3.getCause() instanceof RuntimeException) {
               throw (RuntimeException)var3.getCause();
            } else {
               throw new RuntimeException(var3.getCause());
            }
         } catch (ReflectiveOperationException var4) {
            throw new RuntimeException(var4);
         }
      };
   }

   private static boolean a(qj $$0, String $$1) {
      return $$0.a().toLowerCase().startsWith($$1.toLowerCase() + ".");
   }

   public static Collection<qj> c() {
      return e;
   }

   public static void a(qj $$0) {
      e.add($$0);
   }

   public static void d() {
      e.clear();
   }
}
