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

public class tb {
   private static final Collection<tt> a = Lists.newArrayList();
   private static final Set<String> b = Sets.newHashSet();
   private static final Map<String, Consumer<aqm>> c = Maps.newHashMap();
   private static final Map<String, Consumer<aqm>> d = Maps.newHashMap();
   private static final Set<tt> e = Sets.newHashSet();

   public static void a(Class<?> $$0) {
      Arrays.stream($$0.getDeclaredMethods()).sorted(Comparator.comparing(Method::getName)).forEach(tb::a);
   }

   public static void a(Method $$0) {
      String $$1 = $$0.getDeclaringClass().getSimpleName();
      sq $$2 = $$0.getAnnotation(sq.class);
      if ($$2 != null) {
         a.add(c($$0));
         b.add($$1);
      }

      sx $$3 = $$0.getAnnotation(sx.class);
      if ($$3 != null) {
         a.addAll(b($$0));
         b.add($$1);
      }

      a($$0, so.class, so::a, c);
      a($$0, sn.class, sn::a, d);
   }

   private static <T extends Annotation> void a(Method $$0, Class<T> $$1, Function<T, String> $$2, Map<String, Consumer<aqm>> $$3) {
      T $$4 = $$0.getAnnotation($$1);
      if ($$4 != null) {
         String $$5 = $$2.apply($$4);
         Consumer<aqm> $$6 = $$3.putIfAbsent($$5, (Consumer<aqm>)d($$0));
         if ($$6 != null) {
            throw new RuntimeException("Hey, there should only be one " + $$1 + " method per batch. Batch '" + $$5 + "' has more than one!");
         }
      }
   }

   public static Stream<tt> a(String $$0) {
      return a.stream().filter($$1 -> a($$1, $$0));
   }

   public static Collection<tt> a() {
      return a;
   }

   public static Collection<String> b() {
      return b;
   }

   public static boolean b(String $$0) {
      return b.contains($$0);
   }

   public static Consumer<aqm> c(String $$0) {
      return c.getOrDefault($$0, $$0x -> {
      });
   }

   public static Consumer<aqm> d(String $$0) {
      return d.getOrDefault($$0, $$0x -> {
      });
   }

   public static Optional<tt> e(String $$0) {
      return a().stream().filter($$1 -> $$1.c().equalsIgnoreCase($$0)).findFirst();
   }

   public static tt f(String $$0) {
      Optional<tt> $$1 = e($$0);
      if ($$1.isEmpty()) {
         throw new IllegalArgumentException("Can't find the test function for " + $$0);
      } else {
         return $$1.get();
      }
   }

   private static Collection<tt> b(Method $$0) {
      try {
         Object $$1 = $$0.getDeclaringClass().newInstance();
         return (Collection<tt>)$$0.invoke($$1);
      } catch (ReflectiveOperationException var2) {
         throw new RuntimeException(var2);
      }
   }

   private static tt c(Method $$0) {
      sq $$1 = $$0.getAnnotation(sq.class);
      String $$2 = $$0.getDeclaringClass().getSimpleName();
      String $$3 = $$2.toLowerCase();
      String $$4 = $$3 + "." + $$0.getName().toLowerCase();
      String $$5 = $$1.g().isEmpty() ? $$4 : $$3 + "." + $$1.g();
      String $$6 = $$1.b();
      dkl $$7 = tp.a($$1.d());
      return new tt($$6, $$4, $$5, $$7, $$1.a(), $$1.h(), $$1.e(), $$1.f(), $$1.j(), $$1.i(), $$1.c(), (Consumer<sy>)d($$0));
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

   private static boolean a(tt $$0, String $$1) {
      return $$0.c().toLowerCase().startsWith($$1.toLowerCase() + ".");
   }

   public static Stream<tt> c() {
      return e.stream();
   }

   public static void a(tt $$0) {
      e.add($$0);
   }

   public static void d() {
      e.clear();
   }
}
