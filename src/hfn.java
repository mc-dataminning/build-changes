import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hfn implements hfs {
   private final gqh a;
   private final hiz b;

   public hfn(gqh $$0, hiz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cxw $$0, fho $$1, gny $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(ald b) implements hfw.a {
      public static final MapCodec<hfn.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ald.a.fieldOf("texture").forGetter(hfn.a::b)).apply($$0, hfn.a::new));

      public a(cwv $$0) {
         this(got.b($$0));
      }

      @Override
      public MapCodec<hfn.a> a() {
         return a;
      }

      @Override
      public hfw<?> a(ggz $$0) {
         return new hfn(new gqh($$0), got.a(this.b));
      }
   }
}
