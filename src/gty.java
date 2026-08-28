import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gty(alk c, gty.a d) implements gto.a {
   public static final MapCodec<gty> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alk.a.fieldOf("model").forGetter(gty::a), gty.a.a.forGetter(gty::b)).apply($$0, gty::new)
   );
   public static final Codec<gty> b = a.codec();

   public gty(alk $$0) {
      this($$0, gty.a.b);
   }

   public gty a(i $$0) {
      return this.a(this.d.a($$0));
   }

   public gty b(i $$0) {
      return this.a(this.d.b($$0));
   }

   public gty a(boolean $$0) {
      return this.a(this.d.a($$0));
   }

   public gty a(alk $$0) {
      return new gty($$0, this.d);
   }

   public gty a(gty.a $$0) {
      return new gty(this.c, $$0);
   }

   public gty a(gtz $$0) {
      return $$0.apply(this);
   }

   @Override
   public gto a(hnl $$0) {
      return gtu.a($$0, this.c, this.d.a());
   }

   @Override
   public void a(hnt.a $$0) {
      $$0.markDependency(this.c);
   }

   public alk a() {
      return this.c;
   }

   public gty.a b() {
      return this.d;
   }

   public static record a(i c, i d, boolean e) {
      public static final MapCodec<gty.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  i.e.optionalFieldOf("x", i.a).forGetter(gty.a::b),
                  i.e.optionalFieldOf("y", i.a).forGetter(gty.a::c),
                  Codec.BOOL.optionalFieldOf("uvlock", false).forGetter(gty.a::d)
               )
               .apply($$0, gty.a::new)
      );
      public static final gty.a b = new gty.a(i.a, i.a, false);

      public hnr a() {
         hnd $$0 = hnd.a(this.c, this.d);
         return (hnr)(this.e ? $$0.c() : $$0);
      }

      public gty.a a(i $$0) {
         return new gty.a($$0, this.d, this.e);
      }

      public gty.a b(i $$0) {
         return new gty.a(this.c, $$0, this.e);
      }

      public gty.a a(boolean $$0) {
         return new gty.a(this.c, this.d, $$0);
      }

      public i b() {
         return this.c;
      }

      public i c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }
   }
}
