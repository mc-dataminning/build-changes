import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class hdi implements hdk {
   private final hdw a;
   private final hdk b;
   private final hdk c;

   public hdi(hdw $$0, hdk $$1, hdk $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public void a(hdn $$0, cxy $$1, hdl $$2, cxw $$3, @Nullable ghz $$4, @Nullable bwr $$5, int $$6) {
      (this.a.a($$1, $$4, $$5, $$6, $$3) ? this.b : this.c).a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static record a(hdw b, hdk.b c, hdk.b d) implements hdk.b {
      public static final MapCodec<hdi.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hdv.a.forGetter(hdi.a::b), hdm.a.fieldOf("on_true").forGetter(hdi.a::c), hdm.a.fieldOf("on_false").forGetter(hdi.a::d))
               .apply($$0, hdi.a::new)
      );

      @Override
      public MapCodec<hdi.a> a() {
         return a;
      }

      @Override
      public hdk a(hdk.a $$0) {
         return new hdi(this.b, this.c.a($$0), this.d.a($$0));
      }

      @Override
      public void a(hjk.a $$0) {
         this.c.a($$0);
         this.d.a($$0);
      }
   }
}
