import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class kd implements kj {
   public static final kj.a<kd> a = new kj.a<kd>() {
      public kd a(kk<kd> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         return new kd($$0, fm.a(kr.e.p(), $$1, false).a());
      }
   };
   private final kk<kd> b;
   private final doz c;

   public static Codec<kd> a(kk<kd> $$0) {
      return doz.b.xmap($$1 -> new kd($$0, $$1), $$0x -> $$0x.c);
   }

   public static ye<? super vr, kd> b(kk<kd> $$0) {
      return yc.a(dby.q).a($$1 -> new kd($$0, $$1), $$0x -> $$0x.c);
   }

   public kd(kk<kd> $$0, doz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(in.a $$0) {
      return kr.j.b(this.a()) + " " + fm.a(this.c);
   }

   @Override
   public kk<kd> a() {
      return this.b;
   }

   public doz b() {
      return this.c;
   }
}
