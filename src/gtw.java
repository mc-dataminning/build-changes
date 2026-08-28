import com.mojang.serialization.Codec;
import java.util.List;

public class gtw implements gtp {
   private final gto a;

   public gtw(gto $$0) {
      this.a = $$0;
   }

   @Override
   public void a(azz $$0, List<gto> $$1) {
      $$1.add(this.a);
   }

   @Override
   public hlc a() {
      return this.a.b();
   }

   public static record a(gty e) implements gtp.b {
      public static final Codec<gtw.a> d = gty.b.xmap(gtw.a::new, gtw.a::b);

      @Override
      public gtp a(hnl $$0) {
         return new gtw(this.e.a($$0));
      }

      @Override
      public void a(hnt.a $$0) {
         this.e.a($$0);
      }

      public gty b() {
         return this.e;
      }
   }
}
