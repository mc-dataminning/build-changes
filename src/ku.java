import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;

public class ku implements kw {
   public static final kw.a<ku> a = new kw.a<ku>() {
      public ku a(kx<ku> $$0, StringReader $$1, iz.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         gp.a $$3 = new gp($$2).a($$1);
         ctq $$4 = new go($$3.a(), $$3.b()).a(1, false);
         return new ku($$0, $$4);
      }
   };
   private final kx<ku> b;
   private final ctq c;

   public static MapCodec<ku> a(kx<ku> $$0) {
      return ctq.a.xmap($$1 -> new ku($$0, $$1), $$0x -> $$0x.c).fieldOf("value");
   }

   public static yv<? super wi, ku> b(kx<ku> $$0) {
      return ctq.f.a($$1 -> new ku($$0, $$1), $$0x -> $$0x.c);
   }

   public ku(kx<ku> $$0, ctq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(iz.a $$0) {
      go $$1 = new go(this.c.h(), this.c.a());
      return le.j.b(this.a()) + " " + $$1.a($$0);
   }

   @Override
   public kx<ku> a() {
      return this.b;
   }

   public ctq b() {
      return this.c;
   }
}
