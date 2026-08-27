import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class yf implements uw<wo> {
   private final int a;
   private final byte b;
   private final boolean c;
   @Nullable
   private final List<ebi> d;
   @Nullable
   private final ebl.b e;

   public yf(int $$0, byte $$1, boolean $$2, @Nullable Collection<ebi> $$3, @Nullable ebl.b $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3 != null ? Lists.newArrayList($$3) : null;
      this.e = $$4;
   }

   public yf(sh $$0) {
      this.a = $$0.m();
      this.b = $$0.readByte();
      this.c = $$0.readBoolean();
      this.d = $$0.c($$0x -> $$0x.a((sh.a)($$0xx -> {
            ebi.a $$1x = $$0xx.b(ebi.a.class);
            byte $$2x = $$0xx.readByte();
            byte $$3x = $$0xx.readByte();
            byte $$4x = (byte)($$0xx.readByte() & 15);
            te $$5x = $$0xx.c(sh::l);
            return new ebi($$1x, $$2x, $$3x, $$4x, $$5x);
         })));
      int $$1 = $$0.readUnsignedByte();
      if ($$1 > 0) {
         int $$2 = $$0.readUnsignedByte();
         int $$3 = $$0.readUnsignedByte();
         int $$4 = $$0.readUnsignedByte();
         byte[] $$5 = $$0.b();
         this.e = new ebl.b($$3, $$4, $$1, $$2, $$5);
      } else {
         this.e = null;
      }
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.a);
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$0x.a($$1, ($$0xx, $$1x) -> {
            $$0xx.a($$1x.b());
            $$0xx.k($$1x.c());
            $$0xx.k($$1x.d());
            $$0xx.k($$1x.e() & 15);
            $$0xx.a($$1x.g(), sh::a);
         }));
      if (this.e != null) {
         $$0.k(this.e.c);
         $$0.k(this.e.d);
         $$0.k(this.e.a);
         $$0.k(this.e.b);
         $$0.a(this.e.e);
      } else {
         $$0.k(0);
      }
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public void a(ebl $$0) {
      if (this.d != null) {
         $$0.a(this.d);
      }

      if (this.e != null) {
         this.e.a($$0);
      }
   }

   public byte d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
