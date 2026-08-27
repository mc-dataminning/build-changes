import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gda implements anw {
   public static final gda.a<cjh> a = new gda.a<>();
   public static final gda.a<cjh> b = new gda.a<>();
   public static final gda.a<fcc> c = new gda.a<>();
   private final Map<gda.a<?>, gda.c<?>> d = new HashMap<>();

   @Override
   public void a(anv $$0) {
      for (gda.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gda.a<T> $$0, gda.b<T> $$1) {
      this.d.put($$0, new gda.c<>($$1));
   }

   private <T> gda.c<T> b(gda.a<T> $$0) {
      gda.c<T> $$1 = (gda.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gda.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gdb<T> a(gda.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gcy<T>> {
   }

   static class c<T> {
      private final gda.b<T> a;
      gcy<T> b = gcy.b();

      c(gda.b<T> $$0) {
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
