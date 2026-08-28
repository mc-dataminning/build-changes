import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hcq extends hcn implements hcp {
   public static final MapCodec<hcq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("wobble", true).forGetter(hcn::b), Codec.BOOL.optionalFieldOf("natural_only", true).forGetter($$0x -> $$0x.b))
            .apply($$0, hcq::new)
   );
   private final boolean b;
   private final azh c = azh.a();
   private final hcn.a d;

   public hcq(boolean $$0, boolean $$1) {
      super($$0);
      this.b = $$1;
      this.d = this.a(0.9F);
   }

   @Override
   protected float a(cwp $$0, gfy $$1, int $$2, buk $$3) {
      float $$5;
      if (this.b && !$$1.G_().j()) {
         $$5 = this.c.i();
      } else {
         $$5 = $$1.f(1.0F);
      }

      long $$6 = $$1.ad();
      if (this.d.a($$6)) {
         this.d.a($$6, $$5);
      }

      return this.d.a();
   }

   @Override
   public MapCodec<hcq> a() {
      return a;
   }
}
