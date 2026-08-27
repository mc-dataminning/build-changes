import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class zd {
   private static final int a = 2097152;
   private final rt b;
   private final byte[] c;
   private final List<zd.a> d;

   public zd(dii $$0) {
      this.b = new rt();

      for (Entry<dlk.a, dlk> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new sa($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new tl(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<ht, ddx> $$2 : $$0.G().entrySet()) {
         this.d.add(zd.a.a($$2.getValue()));
      }
   }

   public zd(tl $$0, int $$1, int $$2) {
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
            this.d = $$0.a(zd.a::new);
         }
      }
   }

   public void a(tl $$0) {
      $$0.a((sn)this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   private static int a(dii $$0) {
      int $$1 = 0;

      for (dij $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(tl $$0, dii $$1) {
      for (dij $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<zd.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(zd.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      ht.a $$5 = new ht.a();

      for (zd.a $$6 : this.d) {
         int $$7 = $$3 + iu.b($$6.a >> 4);
         int $$8 = $$4 + iu.b($$6.a);
         $$5.d($$7, $$6.b, $$8);
         $$0.accept($$5, $$6.c, $$6.d);
      }
   }

   public tl a() {
      return new tl(Unpooled.wrappedBuffer(this.c));
   }

   public rt b() {
      return this.b;
   }

   static class a {
      final int a;
      final int b;
      final ddz<?> c;
      @Nullable
      final rt d;

      private a(int $$0, int $$1, ddz<?> $$2, @Nullable rt $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      private a(tl $$0) {
         this.a = $$0.readByte();
         this.b = $$0.readShort();
         this.c = $$0.a(jy.l);
         this.d = $$0.q();
      }

      void a(tl $$0) {
         $$0.k(this.a);
         $$0.l(this.b);
         $$0.a(jy.l, this.c);
         $$0.a((sn)this.d);
      }

      static zd.a a(ddx $$0) {
         rt $$1 = $$0.av_();
         ht $$2 = $$0.p();
         int $$3 = iu.b($$2.u()) << 4 | iu.b($$2.w());
         return new zd.a($$3, $$2.v(), $$0.u(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(ht var1, ddz<?> var2, @Nullable rt var3);
   }
}
