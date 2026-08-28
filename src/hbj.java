import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hbj implements hbl {
   private final hbx a;
   private final hbl b;
   private final hbl c;

   public hbj(hbx $$0, hbl $$1, hbl $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hbo $$0, cwp $$1, hbm $$2, cwn $$3, @Nullable gfz $$4, @Nullable bvh $$5, int $$6) {
      (this.a.a($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hbx b, hbl.b c, hbl.b d) implements hbl.b {
      public static final MapCodec<hbj.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbw.a.forGetter(hbj.a::b), hbn.a.fieldOf("on_true").forGetter(hbj.a::c), hbn.a.fieldOf("on_false").forGetter(hbj.a::d))
               .apply($$0, hbj.a::new)
      );

      @Override
      public MapCodec<hbj.a> a() {
         return a;
      }

      @Override
      public hbl a(hbl.a $$0) {
         return new hbj(this.b, this.c.a($$0), this.d.a($$0));
      }

      @Override
      public void a(hhk.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
