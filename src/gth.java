import com.mojang.serialization.Codec;
import java.util.List;

public class gth implements gta {
   private final gsz a;

   public gth(gsz $$0) {
      this.a = $$0;
   }

   @Override
   public void a(bai $$0, List<gsz> $$1) {
      $$1.add(this.a);
   }

   @Override
   public hkq a() {
      return this.a.b();
   }

   public static record a(gtj e) implements gta.b {
      public static final Codec<gth.a> d = gtj.b.xmap(gth.a::new, gth.a::b);

      @Override
      public gta a(hmz $$0) {
         return new gth(this.e.a($$0));
      }

      @Override
      public void a(hnh.a $$0) {
         this.e.a($$0);
      }

      public gtj b() {
         return this.e;
      }
   }
}
