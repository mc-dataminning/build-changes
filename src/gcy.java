import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gcy implements anv {
   public static final gcy.a<cjf> a = new gcy.a<>();
   public static final gcy.a<cjf> b = new gcy.a<>();
   private final Map<gcy.a<?>, gcy.c<?>> c = new HashMap<>();

   @Override
   public void a(anu $$0) {
      for (gcy.c<?> $$1 : this.c.values()) {
         $$1.a();
      }
   }

   public <T> void a(gcy.a<T> $$0, gcy.b<T> $$1) {
      this.c.put($$0, new gcy.c<>($$1));
   }

   private <T> gcy.c<T> b(gcy.a<T> $$0) {
      gcy.c<T> $$1 = (gcy.c<T>)this.c.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gcy.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gcz<T> a(gcy.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gcw<T>> {
   }

   static class c<T> {
      private final gcy.b<T> a;
      gcw<T> b = gcw.b();

      c(gcy.b<T> $$0) {
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
