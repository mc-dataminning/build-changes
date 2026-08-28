import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gtj(alr c, gtj.a d) implements gsz.a {
   public static final MapCodec<gtj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alr.a.fieldOf("model").forGetter(gtj::a), gtj.a.a.forGetter(gtj::b)).apply($$0, gtj::new)
   );
   public static final Codec<gtj> b = a.codec();

   public gtj(alr $$0) {
      this($$0, gtj.a.b);
   }

   public gtj a(i $$0) {
      return this.a(this.d.a($$0));
   }

   public gtj b(i $$0) {
      return this.a(this.d.b($$0));
   }

   public gtj a(boolean $$0) {
      return this.a(this.d.a($$0));
   }

   public gtj a(alr $$0) {
      return new gtj($$0, this.d);
   }

   public gtj a(gtj.a $$0) {
      return new gtj(this.c, $$0);
   }

   public gtj a(gtk $$0) {
      return $$0.apply(this);
   }

   @Override
   public gsz a(hmz $$0) {
      return gtf.a($$0, this.c, this.d.a());
   }

   @Override
   public void a(hnh.a $$0) {
      $$0.markDependency(this.c);
   }

   public alr a() {
      return this.c;
   }

   public gtj.a b() {
      return this.d;
   }

   public static record a(i c, i d, boolean e) {
      public static final MapCodec<gtj.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  i.e.optionalFieldOf("x", i.a).forGetter(gtj.a::b),
                  i.e.optionalFieldOf("y", i.a).forGetter(gtj.a::c),
                  Codec.BOOL.optionalFieldOf("uvlock", false).forGetter(gtj.a::d)
               )
               .apply($$0, gtj.a::new)
      );
      public static final gtj.a b = new gtj.a(i.a, i.a, false);

      public hnf a() {
         hmr $$0 = hmr.a(this.c, this.d);
         return (hnf)(this.e ? $$0.c() : $$0);
      }

      public gtj.a a(i $$0) {
         return new gtj.a($$0, this.d, this.e);
      }

      public gtj.a b(i $$0) {
         return new gtj.a(this.c, $$0, this.e);
      }

      public gtj.a a(boolean $$0) {
         return new gtj.a(this.c, this.d, $$0);
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
