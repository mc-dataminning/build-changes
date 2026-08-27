import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class kh implements kj {
   public static final kj.a<kh> a = new kj.a<kh>() {
      public kh a(kk<kh> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         gc.a $$3 = new gc($$2).a($$1);
         crj $$4 = new gb($$3.a(), $$3.b()).a(1, false);
         return new kh($$0, $$4);
      }
   };
   private final kk<kh> b;
   private final crj c;

   public static Codec<kh> a(kk<kh> $$0) {
      return crj.a.xmap($$1 -> new kh($$0, $$1), $$0x -> $$0x.c);
   }

   public static ye<? super vr, kh> b(kk<kh> $$0) {
      return crj.f.a($$1 -> new kh($$0, $$1), $$0x -> $$0x.c);
   }

   public kh(kk<kh> $$0, crj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(in.a $$0) {
      gb $$1 = new gb(this.c.g(), this.c.a());
      return kr.j.b(this.a()) + " " + $$1.a($$0);
   }

   @Override
   public kk<kh> a() {
      return this.b;
   }

   public crj b() {
      return this.c;
   }
}
