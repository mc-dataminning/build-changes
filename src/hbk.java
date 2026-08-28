import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hbk implements hbm {
   private final hby a;
   private final hbm b;
   private final hbm c;

   public hbk(hby $$0, hbm $$1, hbm $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hbp $$0, cwq $$1, hbn $$2, cwo $$3, @Nullable gga $$4, @Nullable bvi $$5, int $$6) {
      (this.a.a($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hby b, hbm.b c, hbm.b d) implements hbm.b {
      public static final MapCodec<hbk.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbx.a.forGetter(hbk.a::b), hbo.a.fieldOf("on_true").forGetter(hbk.a::c), hbo.a.fieldOf("on_false").forGetter(hbk.a::d))
               .apply($$0, hbk.a::new)
      );

      @Override
      public MapCodec<hbk.a> a() {
         return a;
      }

      @Override
      public hbm a(hbm.a $$0) {
         return new hbk(this.b, this.c.a($$0), this.d.a($$0));
      }

      @Override
      public void a(hhl.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
