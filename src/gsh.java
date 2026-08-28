import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gsh(alg b, gsh.a c, int d) {
   public static final Codec<gsh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(alg.a.fieldOf("model").forGetter(gsh::a), gsh.a.a.forGetter(gsh::b), ayu.m.optionalFieldOf("weight", 1).forGetter(gsh::c))
            .apply($$0, gsh::new)
   );

   public gsh(alg $$0) {
      this($$0, gsh.a.b, 1);
   }

   public gsh a(i $$0) {
      return this.a(this.c.a($$0));
   }

   public gsh b(i $$0) {
      return this.a(this.c.b($$0));
   }

   public gsh a(boolean $$0) {
      return this.a(this.c.a($$0));
   }

   public gsh a(alg $$0) {
      return new gsh($$0, this.c, this.d);
   }

   public gsh a(gsh.a $$0) {
      return new gsh(this.b, $$0, this.d);
   }

   public gsh a(int $$0) {
      return new gsh(this.b, this.c, $$0);
   }

   public gsh a(gsi $$0) {
      return $$0.apply(this);
   }

   public alg a() {
      return this.b;
   }

   public gsh.a b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public static record a(i c, i d, boolean e) {
      public static final MapCodec<gsh.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  i.e.optionalFieldOf("x", i.a).forGetter(gsh.a::b),
                  i.e.optionalFieldOf("y", i.a).forGetter(gsh.a::c),
                  Codec.BOOL.optionalFieldOf("uvlock", false).forGetter(gsh.a::d)
               )
               .apply($$0, gsh.a::new)
      );
      public static final gsh.a b = new gsh.a(i.a, i.a, false);

      public hly a() {
         hlk $$0 = hlk.a(this.c, this.d);
         return (hly)(this.e ? $$0.c() : $$0);
      }

      public gsh.a a(i $$0) {
         return new gsh.a($$0, this.d, this.e);
      }

      public gsh.a b(i $$0) {
         return new gsh.a(this.c, $$0, this.e);
      }

      public gsh.a a(boolean $$0) {
         return new gsh.a(this.c, this.d, $$0);
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
