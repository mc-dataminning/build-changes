import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gik implements aqi {
   public static final gik.a<cmx> a = new gik.a<>();
   public static final gik.a<cmx> b = new gik.a<>();
   public static final gik.a<fgr> c = new gik.a<>();
   private final Map<gik.a<?>, gik.c<?>> d = new HashMap<>();

   @Override
   public void a(aqh $$0) {
      for (gik.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gik.a<T> $$0, gik.b<T> $$1) {
      this.d.put($$0, new gik.c<>($$1));
   }

   private <T> gik.c<T> b(gik.a<T> $$0) {
      gik.c<T> $$1 = (gik.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gik.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gil<T> a(gik.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gii<T>> {
   }

   static class c<T> {
      private final gik.b<T> a;
      gii<T> b = gii.b();

      c(gik.b<T> $$0) {
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
