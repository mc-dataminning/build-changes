import com.mojang.serialization.Codec;
import java.util.List;

public class gtu implements gtn {
   private final gtm a;

   public gtu(gtm $$0) {
      this.a = $$0;
   }

   @Override
   public void a(azx $$0, List<gtm> $$1) {
      $$1.add(this.a);
   }

   @Override
   public hla a() {
      return this.a.b();
   }

   public static record a(gtw e) implements gtn.b {
      public static final Codec<gtu.a> d = gtw.b.xmap(gtu.a::new, gtu.a::b);

      @Override
      public gtn a(hnj $$0) {
         return new gtu(this.e.a($$0));
      }

      @Override
      public void a(hnr.a $$0) {
         this.e.a($$0);
      }

      public gtw b() {
         return this.e;
      }
   }
}
