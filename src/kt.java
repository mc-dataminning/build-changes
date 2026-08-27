import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;

public class kt implements kv {
   public static final kv.a<kt> a = new kv.a<kt>() {
      public kt a(kw<kt> $$0, StringReader $$1, iy.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         go.a $$3 = new go($$2).a($$1);
         csz $$4 = new gn($$3.a(), $$3.b()).a(1, false);
         return new kt($$0, $$4);
      }
   };
   private final kw<kt> b;
   private final csz c;

   public static Codec<kt> a(kw<kt> $$0) {
      return csz.a.xmap($$1 -> new kt($$0, $$1), $$0x -> $$0x.c);
   }

   public static ys<? super wf, kt> b(kw<kt> $$0) {
      return csz.f.a($$1 -> new kt($$0, $$1), $$0x -> $$0x.c);
   }

   public kt(kw<kt> $$0, csz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public String a(iy.a $$0) {
      gn $$1 = new gn(this.c.g(), this.c.a());
      return ld.j.b(this.a()) + " " + $$1.a($$0);
   }

   @Override
   public kw<kt> a() {
      return this.b;
   }

   public csz b() {
      return this.c;
   }
}
