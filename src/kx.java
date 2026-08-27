import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class kx implements kz {
   public static final kz.a<kx> a = new kz.a<kx>() {
      public kx a(la<kx> $$0, StringReader $$1, jc.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         gs.a $$3 = new gs($$2).a($$1);
         cuh $$4 = new gr($$3.a(), $$3.b()).a(1, false);
         return new kx($$0, $$4);
      }
   };
   private final la<kx> b;
   private final cuh c;

   public static Codec<kx> a(la<kx> $$0) {
      return cuh.a.xmap($$1 -> new kx($$0, $$1), $$0x -> $$0x.c);
   }

   public static zc<? super wp, kx> b(la<kx> $$0) {
      return cuh.f.a($$1 -> new kx($$0, $$1), $$0x -> $$0x.c);
   }

   public kx(la<kx> $$0, cuh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(jc.a $$0) {
      gr $$1 = new gr(this.c.g(), this.c.a());
      return lh.j.b(this.a()) + " " + $$1.a($$0);
   }

   @Override
   public la<kx> a() {
      return this.b;
   }

   public cuh b() {
      return this.c;
   }
}
