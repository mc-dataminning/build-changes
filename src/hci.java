import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hci implements hck {
   private final hcw a;
   private final hck b;
   private final hck c;

   public hci(hcw $$0, hck $$1, hck $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hcn $$0, cxh $$1, hcl $$2, cxf $$3, @Nullable ggy $$4, @Nullable bvy $$5, int $$6) {
      (this.a.a($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hcw b, hck.b c, hck.b d) implements hck.b {
      public static final MapCodec<hci.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hcv.a.forGetter(hci.a::b), hcm.a.fieldOf("on_true").forGetter(hci.a::c), hcm.a.fieldOf("on_false").forGetter(hci.a::d))
               .apply($$0, hci.a::new)
      );

      @Override
      public MapCodec<hci.a> a() {
         return a;
      }

      @Override
      public hck a(hck.a $$0) {
         return new hci(this.b, this.c.a($$0), this.d.a($$0));
      }

      @Override
      public void a(hij.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
