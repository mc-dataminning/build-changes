import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;

public class kp implements kw {
   public static final kw.a<kp> a = new kw.a<kp>() {
      public kp a(kx<kp> $$0, StringReader $$1, iz.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         return new kp($$0, fy.a(le.e.p(), $$1, false).a());
      }
   };
   private final kx<kp> b;
   private final drb c;

   public static MapCodec<kp> a(kx<kp> $$0) {
      return drb.b.xmap($$1 -> new kp($$0, $$1), $$0x -> $$0x.c).fieldOf("value");
   }

   public static yv<? super wi, kp> b(kx<kp> $$0) {
      return yt.a(ddy.q).a($$1 -> new kp($$0, $$1), $$0x -> $$0x.c);
   }

   public kp(kx<kp> $$0, drb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(iz.a $$0) {
      return le.j.b(this.a()) + " " + fy.a(this.c);
   }

   @Override
   public kx<kp> a() {
      return this.b;
   }

   public drb b() {
      return this.c;
   }
}
