import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gsm(alg b, gsm.a c, int d) {
   public static final Codec<gsm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alg.a.fieldOf("model").forGetter(gsm::a), gsm.a.a.forGetter(gsm::b), ayu.m.optionalFieldOf("weight", 1).forGetter(gsm::c))
            .apply($$0, gsm::new)
   );

   public gsm(alg $$0) {
      this($$0, gsm.a.b, 1);
   }

   public gsm a(i $$0) {
      return this.a(this.c.a($$0));
   }

   public gsm b(i $$0) {
      return this.a(this.c.b($$0));
   }

   public gsm a(boolean $$0) {
      return this.a(this.c.a($$0));
   }

   public gsm a(alg $$0) {
      return new gsm($$0, this.c, this.d);
   }

   public gsm a(gsm.a $$0) {
      return new gsm(this.b, $$0, this.d);
   }

   public gsm a(int $$0) {
      return new gsm(this.b, this.c, $$0);
   }

   public gsm a(gsn $$0) {
      return $$0.apply(this);
   }

   public alg a() {
      return this.b;
   }

   public gsm.a b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public static record a(i c, i d, boolean e) {
      public static final MapCodec<gsm.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  i.e.optionalFieldOf("x", i.a).forGetter(gsm.a::b),
                  i.e.optionalFieldOf("y", i.a).forGetter(gsm.a::c),
                  Codec.BOOL.optionalFieldOf("uvlock", false).forGetter(gsm.a::d)
               )
               .apply($$0, gsm.a::new)
      );
      public static final gsm.a b = new gsm.a(i.a, i.a, false);

      public hmf a() {
         hlr $$0 = hlr.a(this.c, this.d);
         return (hmf)(this.e ? $$0.c() : $$0);
      }

      public gsm.a a(i $$0) {
         return new gsm.a($$0, this.d, this.e);
      }

      public gsm.a b(i $$0) {
         return new gsm.a(this.c, $$0, this.e);
      }

      public gsm.a a(boolean $$0) {
         return new gsm.a(this.c, this.d, $$0);
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
