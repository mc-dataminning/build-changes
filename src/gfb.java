import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gfb implements ape {
   public static final gfb.a<clb> a = new gfb.a<>();
   public static final gfb.a<clb> b = new gfb.a<>();
   public static final gfb.a<fdz> c = new gfb.a<>();
   private final Map<gfb.a<?>, gfb.c<?>> d = new HashMap<>();

   @Override
   public void a(apd $$0) {
      for (gfb.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gfb.a<T> $$0, gfb.b<T> $$1) {
      this.d.put($$0, new gfb.c<>($$1));
   }

   private <T> gfb.c<T> b(gfb.a<T> $$0) {
      gfb.c<T> $$1 = (gfb.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gfb.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gfc<T> a(gfb.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gez<T>> {
   }

   static class c<T> {
      private final gfb.b<T> a;
      gez<T> b = gez.b();

      c(gfb.b<T> $$0) {
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
