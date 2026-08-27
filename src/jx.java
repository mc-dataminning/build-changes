import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class jx implements jz {
   public static final jz.a<jx> a = new jz.a<jx>() {
      public jx a(ka<jx> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         gc.a $$3 = new gc($$2).a($$1);
         cpq $$4 = new gb($$3.a(), $$3.b()).a(1, false);
         return new jx($$0, $$4);
      }
   };
   private final ka<jx> b;
   private final cpq c;

   public static Codec<jx> a(ka<jx> $$0) {
      return cpq.a.xmap($$1 -> new jx($$0, $$1), $$0x -> $$0x.c);
   }

   public static xq<? super vd, jx> b(ka<jx> $$0) {
      return cpq.f.a($$1 -> new jx($$0, $$1), $$0x -> $$0x.c);
   }

   public jx(ka<jx> $$0, cpq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(in.a $$0) {
      return kh.j.b(this.a()) + " " + new gb(this.c.e(), this.c.w()).b();
   }

   @Override
   public ka<jx> a() {
      return this.b;
   }

   public cpq b() {
      return this.c;
   }
}
