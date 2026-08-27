import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class kf implements kl {
   public static final kl.a<kf> a = new kl.a<kf>() {
      public kf a(km<kf> $$0, StringReader $$1, ip.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         return new kf($$0, fo.a(kt.e.p(), $$1, false).a());
      }
   };
   private final km<kf> b;
   private final dpi c;

   public static Codec<kf> a(km<kf> $$0) {
      return dpi.b.xmap($$1 -> new kf($$0, $$1), $$0x -> $$0x.c);
   }

   public static yg<? super vt, kf> b(km<kf> $$0) {
      return ye.a(dch.q).a($$1 -> new kf($$0, $$1), $$0x -> $$0x.c);
   }

   public kf(km<kf> $$0, dpi $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(ip.a $$0) {
      return kt.j.b(this.a()) + " " + fo.a(this.c);
   }

   @Override
   public km<kf> a() {
      return this.b;
   }

   public dpi b() {
      return this.c;
   }
}
