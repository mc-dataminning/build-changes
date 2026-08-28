import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hdn implements hds {
   private final goh a;
   private final hgz b;

   public hdn(goh $$0, hgz $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(cwn $$0, ffu $$1, gly $$2, int $$3, int $$4, boolean $$5) {
      this.a.a($$1, $$2, $$3, $$4, this.b);
   }

   public static record a(akv b) implements hdw.a {
      public static final MapCodec<hdn.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akv.a.fieldOf("texture").forGetter(hdn.a::b)).apply($$0, hdn.a::new));

      public a(cvm $$0) {
         this(gmt.b($$0));
      }

      @Override
      public MapCodec<hdn.a> a() {
         return a;
      }

      @Override
      public hdw<?> a(gez $$0) {
         return new hdn(new goh($$0), gmt.a(this.b));
      }
   }
}
