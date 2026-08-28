import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class gsx implements aup {
   public static final gsx.a<cun> a = new gsx.a<>();
   public static final gsx.a<cun> b = new gsx.a<>();
   public static final gsx.a<fqs> c = new gsx.a<>();
   private final Map<gsx.a<?>, gsx.c<?>> d = new HashMap<>();

   @Override
   public void a(auo $$0) {
      for (gsx.c<?> $$1 : this.d.values()) {
         $$1.a();
      }
   }

   public <T> void a(gsx.a<T> $$0, gsx.b<T> $$1) {
      this.d.put($$0, new gsx.c<>($$1));
   }

   private <T> gsx.c<T> b(gsx.a<T> $$0) {
      gsx.c<T> $$1 = (gsx.c<T>)this.d.get($$0);
      if ($$1 == null) {
         throw new IllegalStateException("Tree builder not registered");
      } else {
         return $$1;
      }
   }

   public <T> void a(gsx.a<T> $$0, List<T> $$1) {
      this.b($$0).a($$1);
   }

   public <T> gsy<T> a(gsx.a<T> $$0) {
      return this.b($$0).b;
   }

   public static class a<T> {
   }

   public interface b<T> extends Function<List<T>, gsv<T>> {
   }

   static class c<T> {
      private final gsx.b<T> a;
      gsv<T> b = gsv.b();

      c(gsx.b<T> $$0) {
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
