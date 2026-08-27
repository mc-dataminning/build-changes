import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gks implements asb {
   public static final gks.a<coz> a = new gks.a<>();
   public static final gks.a<coz> b = new gks.a<>();
   public static final gks.a<fiw> c = new gks.a<>();
   private final Map<gks.a<?>, gks.c<?>> d = new HashMap<>();

   @Override
   public void a(asa $$0) {
      for (gks.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gks.a<T> $$0, gks.b<T> $$1) {
      this.d.put($$0, new gks.c<>($$1));
   }

   private <T> gks.c<T> b(gks.a<T> $$0) {
      gks.c<T> $$1 = (gks.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gks.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gkt<T> a(gks.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gkq<T>> {
   }

   static class c<T> {
      private final gks.b<T> a;
      gkq<T> b = gkq.b();

      c(gks.b<T> $$0) {
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
