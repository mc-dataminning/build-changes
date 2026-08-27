import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gil implements aqi {
   public static final gil.a<cmx> a = new gil.a<>();
   public static final gil.a<cmx> b = new gil.a<>();
   public static final gil.a<fgs> c = new gil.a<>();
   private final Map<gil.a<?>, gil.c<?>> d = new HashMap<>();

   @Override
   public void a(aqh $$0) {
      for (gil.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gil.a<T> $$0, gil.b<T> $$1) {
      this.d.put($$0, new gil.c<>($$1));
   }

   private <T> gil.c<T> b(gil.a<T> $$0) {
      gil.c<T> $$1 = (gil.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gil.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gim<T> a(gil.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gij<T>> {
   }

   static class c<T> {
      private final gil.b<T> a;
      gij<T> b = gij.b();

      c(gil.b<T> $$0) {
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
