import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class jt implements jz {
   public static final jz.a<jt> a = new jz.a<jt>() {
      public jt a(ka<jt> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         return new jt($$0, fm.a(kh.e.p(), $$1, false).a());
      }
   };
   private final ka<jt> b;
   private final dme c;

   public static Codec<jt> a(ka<jt> $$0) {
      return dme.b.xmap($$1 -> new jt($$0, $$1), $$0x -> $$0x.c);
   }

   public static xq<? super vd, jt> b(ka<jt> $$0) {
      return xo.a(czf.q).a($$1 -> new jt($$0, $$1), $$0x -> $$0x.c);
   }

   public jt(ka<jt> $$0, dme $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(in.a $$0) {
      return kh.j.b(this.a()) + " " + fm.a(this.c);
   }

   @Override
   public ka<jt> a() {
      return this.b;
   }

   public dme b() {
      return this.c;
   }
}
