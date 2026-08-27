import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class ry {
   private static final Collection<sq> a = Lists.newArrayList();
   private static final Set<String> b = Sets.newHashSet();
   private static final Map<String, Consumer<apf>> c = Maps.newHashMap();
   private static final Map<String, Consumer<apf>> d = Maps.newHashMap();
   private static final Set<sq> e = Sets.newHashSet();

   public static void a(Class<?> $$0) {
      Arrays.stream($$0.getDeclaredMethods()).sorted(Comparator.comparing(Method::getName)).forEach(ry::a);
   }

   public static void a(Method $$0) {
      String $$1 = $$0.getDeclaringClass().getSimpleName();
      rn $$2 = $$0.getAnnotation(rn.class);
      if ($$2 != null) {
         a.add(c($$0));
         b.add($$1);
      }

      ru $$3 = $$0.getAnnotation(ru.class);
      if ($$3 != null) {
         a.addAll(b($$0));
         b.add($$1);
      }

      a($$0, rl.class, rl::a, c);
      a($$0, rk.class, rk::a, d);
   }

   private static <T extends Annotation> void a(Method $$0, Class<T> $$1, Function<T, String> $$2, Map<String, Consumer<apf>> $$3) {
      T $$4 = $$0.getAnnotation($$1);
      if ($$4 != null) {
         String $$5 = $$2.apply($$4);
         Consumer<apf> $$6 = $$3.putIfAbsent($$5, (Consumer<apf>)d($$0));
         if ($$6 != null) {
            throw new RuntimeException("Hey, there should only be one " + $$1 + " method per batch. Batch '" + $$5 + "' has more than one!");
         }
      }
   }

   public static Stream<sq> a(String $$0) {
      return a.stream().filter($$1 -> a($$1, $$0));
   }

   public static Collection<sq> a() {
      return a;
   }

   public static Collection<String> b() {
      return b;
   }

   public static boolean b(String $$0) {
      return b.contains($$0);
   }

   public static Consumer<apf> c(String $$0) {
      return c.getOrDefault($$0, $$0x -> {
      });
   }

   public static Consumer<apf> d(String $$0) {
      return d.getOrDefault($$0, $$0x -> {
      });
   }

   public static Optional<sq> e(String $$0) {
      return a().stream().filter($$1 -> $$1.c().equalsIgnoreCase($$0)).findFirst();
   }

   public static sq f(String $$0) {
      Optional<sq> $$1 = e($$0);
      if ($$1.isEmpty()) {
         throw new IllegalArgumentException("Can't find the test function for " + $$0);
      } else {
         return $$1.get();
      }
   }

   private static Collection<sq> b(Method $$0) {
      try {
         Object $$1 = $$0.getDeclaringClass().newInstance();
         return (Collection<sq>)$$0.invoke($$1);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException(var2);
      }
   }

   private static sq c(Method $$0) {
      rn $$1 = $$0.getAnnotation(rn.class);
      String $$2 = $$0.getDeclaringClass().getSimpleName();
      String $$3 = $$2.toLowerCase();
      String $$4 = $$3 + "." + $$0.getName().toLowerCase();
      String $$5 = $$1.f().isEmpty() ? $$4 : $$3 + "." + $$1.f();
      String $$6 = $$1.b();
      dgo $$7 = sm.a($$1.d());
      return new sq($$6, $$4, $$5, $$7, $$1.a(), $$1.g(), $$1.e(), $$1.i(), $$1.h(), $$1.c(), (Consumer<rv>)d($$0));
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

   private static boolean a(sq $$0, String $$1) {
      return $$0.c().toLowerCase().startsWith($$1.toLowerCase() + ".");
   }

   public static Stream<sq> c() {
      return e.stream();
   }

   public static void a(sq $$0) {
      e.add($$0);
   }

   public static void d() {
      e.clear();
   }
}
