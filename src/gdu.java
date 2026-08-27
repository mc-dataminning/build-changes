import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gdu implements aou {
   public static final gdu.a<ckj> a = new gdu.a<>();
   public static final gdu.a<ckj> b = new gdu.a<>();
   public static final gdu.a<fcu> c = new gdu.a<>();
   private final Map<gdu.a<?>, gdu.c<?>> d = new HashMap<>();

   @Override
   public void a(aot $$0) {
      for (gdu.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gdu.a<T> $$0, gdu.b<T> $$1) {
      this.d.put($$0, new gdu.c<>($$1));
   }

   private <T> gdu.c<T> b(gdu.a<T> $$0) {
      gdu.c<T> $$1 = (gdu.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gdu.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gdv<T> a(gdu.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gds<T>> {
   }

   static class c<T> {
      private final gdu.b<T> a;
      gds<T> b = gds.b();

      c(gdu.b<T> $$0) {
         this.a = $$0;
      }

      void a(List<T> $$0) {
         this.b = this.a.apply($$0);
         this.b.a();
      }

      void a() {
         this.b.a();
      }
   }
}
