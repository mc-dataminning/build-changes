import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Function;

public abstract class kv implements dl<dgg> {
   private final List<bt> a;

   protected kv(List<bt> $$0) {
      this.a = $$0;
   }

   public static <T extends kv> Codec<T> a(Function<List<bt>, T> $$0) {
      return bt.a.listOf().xmap($$0, kv::b);
   }

   protected List<bt> b() {
      return this.a;
   }

   public boolean a(dgg $$0) {
      for (bt $$1 : this.a) {
         if (!$$1.a($$0)) {
            return false;
         }
      }

      return true;
   }

   public static kv.a a(List<bt> $$0) {
      return new kv.a($$0);
   }

   public static kv.b b(List<bt> $$0) {
      return new kv.b($$0);
   }

   public static class a extends kv {
      public static final Codec<kv.a> a = a(kv.a::new);

      protected a(List<bt> $$0) {
         super($$0);
      }

      @Override
      public kj<dgg> a() {
         return kk.l;
      }
   }

   public static class b extends kv {
      public static final Codec<kv.b> a = a(kv.b::new);

      protected b(List<bt> $$0) {
         super($$0);
      }

      @Override
      public kj<dgg> a() {
         return kk.J;
      }
   }
}
