import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class jy implements ka {
   public static final ka.a<jy> a = new ka.a<jy>() {
      public jy a(kb<jy> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         gc.a $$3 = new gc($$2).a($$1);
         cqk $$4 = new gb($$3.a(), $$3.b()).a(1, false);
         return new jy($$0, $$4);
      }
   };
   private final kb<jy> b;
   private final cqk c;

   public static Codec<jy> a(kb<jy> $$0) {
      return cqk.a.xmap($$1 -> new jy($$0, $$1), $$0x -> $$0x.c);
   }

   public static xs<? super vf, jy> b(kb<jy> $$0) {
      return cqk.f.a($$1 -> new jy($$0, $$1), $$0x -> $$0x.c);
   }

   public jy(kb<jy> $$0, cqk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(in.a $$0) {
      return ki.j.b(this.a()) + " " + new gb(this.c.e(), this.c.w()).b();
   }

   @Override
   public kb<jy> a() {
      return this.b;
   }

   public cqk b() {
      return this.c;
   }
}
