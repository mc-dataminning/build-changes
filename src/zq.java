import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class zq {
   private static final int a = 2097152;
   private final sd b;
   private final byte[] c;
   private final List<zq.a> d;

   public zq(dju $$0) {
      this.b = new sd();

      for (Entry<dmw.a, dmw> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new sk($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new ty(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<hx, dfi> $$2 : $$0.G().entrySet()) {
         this.d.add(zq.a.a($$2.getValue()));
      }
   }

   public zq(ty $$0, int $$1, int $$2) {
      this.b = $$0.q();
      if (this.b == null) {
         throw new RuntimeException("Can't read heightmap in packet for [" + $$1 + ", " + $$2 + "]");
      } else {
         int $$3 = $$0.n();
         if ($$3 > 2097152) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
         } else {
            this.c = new byte[$$3];
            $$0.b(this.c);
            this.d = $$0.a(zq.a::new);
         }
      }
   }

   public void a(ty $$0) {
      $$0.a((ta)this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   private static int a(dju $$0) {
      int $$1 = 0;

      for (djv $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(ty $$0, dju $$1) {
      for (djv $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<zq.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(zq.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      hx.a $$5 = new hx.a();

      for (zq.a $$6 : this.d) {
         int $$7 = $$3 + iy.b($$6.a >> 4);
         int $$8 = $$4 + iy.b($$6.a);
         $$5.d($$7, $$6.b, $$8);
         $$0.accept($$5, $$6.c, $$6.d);
      }
   }

   public ty a() {
      return new ty(Unpooled.wrappedBuffer(this.c));
   }

   public sd b() {
      return this.b;
   }

   static class a {
      final int a;
      final int b;
      final dfk<?> c;
      @Nullable
      final sd d;

      private a(int $$0, int $$1, dfk<?> $$2, @Nullable sd $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      private a(ty $$0) {
         this.a = $$0.readByte();
         this.b = $$0.readShort();
         this.c = $$0.a(kc.l);
         this.d = $$0.q();
      }

      void a(ty $$0) {
         $$0.k(this.a);
         $$0.l(this.b);
         $$0.a(kc.l, this.c);
         $$0.a((ta)this.d);
      }

      static zq.a a(dfi $$0) {
         sd $$1 = $$0.ay_();
         hx $$2 = $$0.aC_();
         int $$3 = iy.b($$2.u()) << 4 | iy.b($$2.w());
         return new zq.a($$3, $$2.v(), $$0.v(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(hx var1, dfk<?> var2, @Nullable sd var3);
   }
}
