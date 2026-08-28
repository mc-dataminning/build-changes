import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Function;

public abstract class kw implements dm<dgt> {
   private final List<bu> a;

   protected kw(List<bu> $$0) {
      this.a = $$0;
   }

   public static <T extends kw> Codec<T> a(Function<List<bu>, T> $$0) {
      return bu.a.listOf().xmap($$0, kw::b);
   }

   protected List<bu> b() {
      return this.a;
   }

   public boolean a(dgt $$0) {
      for (bu $$1 : this.a) {
         if (!$$1.a($$0)) {
            return false;
         }
      }

      return true;
   }

   public static kw.a a(List<bu> $$0) {
      return new kw.a($$0);
   }

   public static kw.b b(List<bu> $$0) {
      return new kw.b($$0);
   }

   public static class a extends kw {
      public static final Codec<kw.a> a = a(kw.a::new);

      protected a(List<bu> $$0) {
         super($$0);
      }

      @Override
      public kk<dgt> a() {
         return kl.l;
      }
   }

   public static class b extends kw {
      public static final Codec<kw.b> a = a(kw.b::new);

      protected b(List<bu> $$0) {
         super($$0);
      }

      @Override
      public kk<dgt> a() {
         return kl.J;
      }
   }
}
