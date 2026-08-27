import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class kj implements kl {
   public static final kl.a<kj> a = new kl.a<kj>() {
      public kj a(km<kj> $$0, StringReader $$1, ip.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         ge.a $$3 = new ge($$2).a($$1);
         crs $$4 = new gd($$3.a(), $$3.b()).a(1, false);
         return new kj($$0, $$4);
      }
   };
   private final km<kj> b;
   private final crs c;

   public static Codec<kj> a(km<kj> $$0) {
      return crs.a.xmap($$1 -> new kj($$0, $$1), $$0x -> $$0x.c);
   }

   public static yg<? super vt, kj> b(km<kj> $$0) {
      return crs.f.a($$1 -> new kj($$0, $$1), $$0x -> $$0x.c);
   }

   public kj(km<kj> $$0, crs $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(ip.a $$0) {
      gd $$1 = new gd(this.c.g(), this.c.a());
      return kt.j.b(this.a()) + " " + $$1.a($$0);
   }

   @Override
   public km<kj> a() {
      return this.b;
   }

   public crs b() {
      return this.c;
   }
}
