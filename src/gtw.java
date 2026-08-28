import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gtw(ali c, gtw.a d) implements gtm.a {
   public static final MapCodec<gtw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.a.fieldOf("model").forGetter(gtw::a), gtw.a.a.forGetter(gtw::b)).apply($$0, gtw::new)
   );
   public static final Codec<gtw> b = a.codec();

   public gtw(ali $$0) {
      this($$0, gtw.a.b);
   }

   public gtw a(i $$0) {
      return this.a(this.d.a($$0));
   }

   public gtw b(i $$0) {
      return this.a(this.d.b($$0));
   }

   public gtw a(boolean $$0) {
      return this.a(this.d.a($$0));
   }

   public gtw a(ali $$0) {
      return new gtw($$0, this.d);
   }

   public gtw a(gtw.a $$0) {
      return new gtw(this.c, $$0);
   }

   public gtw a(gtx $$0) {
      return $$0.apply(this);
   }

   @Override
   public gtm a(hnj $$0) {
      return gts.a($$0, this.c, this.d.a());
   }

   @Override
   public void a(hnr.a $$0) {
      $$0.markDependency(this.c);
   }

   public ali a() {
      return this.c;
   }

   public gtw.a b() {
      return this.d;
   }

   public static record a(i c, i d, boolean e) {
      public static final MapCodec<gtw.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  i.e.optionalFieldOf("x", i.a).forGetter(gtw.a::b),
                  i.e.optionalFieldOf("y", i.a).forGetter(gtw.a::c),
                  Codec.BOOL.optionalFieldOf("uvlock", false).forGetter(gtw.a::d)
               )
               .apply($$0, gtw.a::new)
      );
      public static final gtw.a b = new gtw.a(i.a, i.a, false);

      public hnp a() {
         hnb $$0 = hnb.a(this.c, this.d);
         return (hnp)(this.e ? $$0.c() : $$0);
      }

      public gtw.a a(i $$0) {
         return new gtw.a($$0, this.d, this.e);
      }

      public gtw.a b(i $$0) {
         return new gtw.a(this.c, $$0, this.e);
      }

      public gtw.a a(boolean $$0) {
         return new gtw.a(this.c, this.d, $$0);
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
