import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gnb implements asp {
   public static final gnb.a<cqm> a = new gnb.a<>();
   public static final gnb.a<cqm> b = new gnb.a<>();
   public static final gnb.a<fkz> c = new gnb.a<>();
   private final Map<gnb.a<?>, gnb.c<?>> d = new HashMap<>();

   @Override
   public void a(aso $$0) {
      for (gnb.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gnb.a<T> $$0, gnb.b<T> $$1) {
      this.d.put($$0, new gnb.c<>($$1));
   }

   private <T> gnb.c<T> b(gnb.a<T> $$0) {
      gnb.c<T> $$1 = (gnb.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gnb.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gnc<T> a(gnb.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gmz<T>> {
   }

   static class c<T> {
      private final gnb.b<T> a;
      gmz<T> b = gmz.b();

      c(gnb.b<T> $$0) {
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
