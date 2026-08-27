import com.google.common.base.Suppliers;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelPromise;
import io.netty.channel.DefaultEventLoopGroup;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.flow.FlowControlHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.TimeoutException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class uq extends SimpleChannelInboundHandler<xz<?>> {
   private static final float h = 0.75F;
   private static final Logger i = LogUtils.getLogger();
   public static final Marker a = MarkerFactory.getMarker("NETWORK");
   public static final Marker b = ac.a(MarkerFactory.getMarker("NETWORK_PACKETS"), $$0 -> $$0.add(a));
   public static final Marker c = ac.a(MarkerFactory.getMarker("PACKET_RECEIVED"), $$0 -> $$0.add(b));
   public static final Marker d = ac.a(MarkerFactory.getMarker("PACKET_SENT"), $$0 -> $$0.add(b));
   public static final Supplier<NioEventLoopGroup> e = Suppliers.memoize(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build())
   );
   public static final Supplier<EpollEventLoopGroup> f = Suppliers.memoize(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build())
   );
   public static final Supplier<DefaultEventLoopGroup> g = Suppliers.memoize(
      () -> new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build())
   );
   private static final va<agy> j = agx.a;
   private final ya k;
   private volatile boolean l = true;
   private final Queue<Consumer<uq>> m = Queues.newConcurrentLinkedQueue();
   private Channel n;
   private SocketAddress o;
   @Nullable
   private volatile uy p;
   @Nullable
   private volatile uy q;
   @Nullable
   private vs r;
   private boolean s;
   private boolean t;
   private int u;
   private int v;
   private float w;
   private float x;
   private int y;
   private boolean z;
   @Nullable
   private volatile vs A;
   @Nullable
   uj B;

   public uq(ya $$0) {
      this.k = $$0;
   }

   public void channelActive(ChannelHandlerContext $$0) throws Exception {
      super.channelActive($$0);
      this.n = $$0.channel();
      this.o = this.n.remoteAddress();
      if (this.A != null) {
         this.a(this.A);
      }
   }

   public void channelInactive(ChannelHandlerContext $$0) {
      this.a(vs.c("disconnect.endOfStream"));
   }

   public void exceptionCaught(ChannelHandlerContext $$0, Throwable $$1) {
      if ($$1 instanceof vf) {
         i.debug("Skipping packet due to errors", $$1.getCause());
      } else {
         boolean $$2 = !this.z;
         this.z = true;
         if (this.n.isOpen()) {
            if ($$1 instanceof TimeoutException) {
               i.debug("Timeout", $$1);
               this.a(vs.c("disconnect.timeout"));
            } else {
               vs $$3 = vs.a("disconnect.genericReason", "Internal Exception: " + $$1);
               if ($$2) {
                  i.debug("Failed to sent packet", $$1);
                  if (this.g() == ya.b) {
                     xz<?> $$4 = (xz<?>)(this.l ? new ahf($$3) : new yh($$3));
                     this.a($$4, uz.a(() -> this.a($$3)));
                  } else {
                     this.a($$3);
                  }

                  this.m();
               } else {
                  i.debug("Double fault", $$1);
                  this.a($$3);
               }
            }
         }
      }
   }

   protected void a(ChannelHandlerContext $$0, xz<?> $$1) {
      if (this.n.isOpen()) {
         uy $$2 = this.q;
         if ($$2 == null) {
            throw new IllegalStateException("Received a packet before the packet listener was initialized");
         } else {
            if ($$2.a($$1)) {
               try {
                  a($$1, $$2);
               } catch (ajn var5) {
               } catch (RejectedExecutionException var6) {
                  this.a(vs.c("multiplayer.disconnect.server_shutdown"));
               } catch (ClassCastException var7) {
                  i.error("Received {} that couldn't be processed", $$1.getClass(), var7);
                  this.a(vs.c("multiplayer.disconnect.invalid_packet"));
               }

               this.u++;
            }
         }
      }
   }

   private static <T extends uy> void a(xz<T> $$0, uy $$1) {
      $$0.a((T)$$1);
   }

   private void b(va<?> $$0, uy $$1) {
      Validate.notNull($$1, "packetListener", new Object[0]);
      ya $$2 = $$1.a();
      if ($$2 != this.k) {
         throw new IllegalStateException("Trying to set listener for wrong side: connection is " + this.k + ", but listener is " + $$2);
      } else {
         ur $$3 = $$1.b();
         if ($$0.a() != $$3) {
            throw new IllegalStateException("Listener protocol (" + $$3 + ") does not match requested one " + $$0);
         }
      }
   }

   public <T extends uy> void a(va<T> $$0, T $$1) {
      this.b($$0, $$1);
      if ($$0.b() != this.f()) {
         throw new IllegalStateException("Invalid inbound protocol: " + $$0.a());
      } else {
         this.q = $$1;
         this.p = null;
         vh.b $$2 = vh.a($$0);
         xy $$3 = $$0.d();
         if ($$3 != null) {
            uu $$4 = new uu($$3);
            $$2 = $$2.andThen($$1x -> $$1x.pipeline().addAfter("decoder", "bundler", $$4));
         }

         this.n.writeAndFlush($$2).syncUninterruptibly();
      }
   }

   public void a(va<?> $$0) {
      if ($$0.b() != this.g()) {
         throw new IllegalStateException("Invalid outbound protocol: " + $$0.a());
      } else {
         vh.d $$1 = vh.b($$0);
         xy $$2 = $$0.d();
         if ($$2 != null) {
            uv $$3 = new uv($$2);
            $$1 = $$1.andThen($$1x -> $$1x.pipeline().addAfter("encoder", "unbundler", $$3));
         }

         boolean $$4 = $$0.a() == ur.d;
         this.n.writeAndFlush($$1.andThen($$1x -> this.l = $$4)).syncUninterruptibly();
      }
   }

   public void a(uy $$0) {
      if (this.q != null) {
         throw new IllegalStateException("Listener already set");
      } else if (this.k == ya.a && $$0.a() == ya.a && $$0.b() == j.a()) {
         this.q = $$0;
      } else {
         throw new IllegalStateException("Invalid initial listener");
      }
   }

   public void a(String $$0, int $$1, aia $$2) {
      this.a($$0, $$1, aig.a, aig.b, $$2, agu.a);
   }

   public void a(String $$0, int $$1, aha $$2) {
      this.a($$0, $$1, ahh.a, ahh.b, $$2, agu.b);
   }

   public <S extends ve, C extends un> void a(String $$0, int $$1, va<S> $$2, va<C> $$3, C $$4, boolean $$5) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5 ? agu.c : agu.b);
   }

   private <S extends ve, C extends un> void a(String $$0, int $$1, va<S> $$2, va<C> $$3, C $$4, agu $$5) {
      if ($$2.a() != $$3.a()) {
         throw new IllegalStateException("Mismatched initial protocols");
      } else {
         this.p = $$4;
         this.a((Consumer<uq>)($$6 -> {
            this.a($$3, $$4);
            $$6.b(new agv(aa.b().e(), $$0, $$1, $$5), null, true);
            this.a($$2);
         }));
      }
   }

   public void a(xz<?> $$0) {
      this.a($$0, null);
   }

   public void a(xz<?> $$0, @Nullable uz $$1) {
      this.a($$0, $$1, true);
   }

   public void a(xz<?> $$0, @Nullable uz $$1, boolean $$2) {
      if (this.i()) {
         this.r();
         this.b($$0, $$1, $$2);
      } else {
         this.m.add($$3 -> $$3.b($$0, $$1, $$2));
      }
   }

   public void a(Consumer<uq> $$0) {
      if (this.i()) {
         this.r();
         $$0.accept(this);
      } else {
         this.m.add($$0);
      }
   }

   private void b(xz<?> $$0, @Nullable uz $$1, boolean $$2) {
      this.v++;
      if (this.n.eventLoop().inEventLoop()) {
         this.c($$0, $$1, $$2);
      } else {
         this.n.eventLoop().execute(() -> this.c($$0, $$1, $$2));
      }
   }

   private void c(xz<?> $$0, @Nullable uz $$1, boolean $$2) {
      ChannelFuture $$3 = $$2 ? this.n.writeAndFlush($$0) : this.n.write($$0);
      if ($$1 != null) {
         $$3.addListener($$1x -> {
            if ($$1x.isSuccess()) {
               $$1.a();
            } else {
               xz<?> $$2x = $$1.b();
               if ($$2x != null) {
                  ChannelFuture $$3x = this.n.writeAndFlush($$2x);
                  $$3x.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
               }
            }
         });
      }

      $$3.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
   }

   public void a() {
      if (this.i()) {
         this.q();
      } else {
         this.m.add(uq::q);
      }
   }

   private void q() {
      if (this.n.eventLoop().inEventLoop()) {
         this.n.flush();
      } else {
         this.n.eventLoop().execute(() -> this.n.flush());
      }
   }

   private void r() {
      if (this.n != null && this.n.isOpen()) {
         synchronized (this.m) {
            Consumer<uq> $$0;
            while (($$0 = this.m.poll()) != null) {
               $$0.accept(this);
            }
         }
      }
   }

   public void b() {
      this.r();
      if (this.q instanceof vg $$0) {
         $$0.e();
      }

      if (!this.i() && !this.t) {
         this.n();
      }

      if (this.n != null) {
         this.n.flush();
      }

      if (this.y++ % 20 == 0) {
         this.c();
      }

      if (this.B != null) {
         this.B.a();
      }
   }

   protected void c() {
      this.x = awm.i(0.75F, (float)this.v, this.x);
      this.w = awm.i(0.75F, (float)this.u, this.w);
      this.v = 0;
      this.u = 0;
   }

   public SocketAddress d() {
      return this.o;
   }

   public String a(boolean $$0) {
      if (this.o == null) {
         return "local";
      } else {
         return $$0 ? this.o.toString() : "IP hidden";
      }
   }

   public void a(vs $$0) {
      if (this.n == null) {
         this.A = $$0;
      }

      if (this.i()) {
         this.n.close().awaitUninterruptibly();
         this.r = $$0;
      }
   }

   public boolean e() {
      return this.n instanceof LocalChannel || this.n instanceof LocalServerChannel;
   }

   public ya f() {
      return this.k;
   }

   public ya g() {
      return this.k.a();
   }

   public static uq a(InetSocketAddress $$0, boolean $$1, @Nullable bii $$2) {
      uq $$3 = new uq(ya.b);
      if ($$2 != null) {
         $$3.a($$2);
      }

      ChannelFuture $$4 = a($$0, $$1, $$3);
      $$4.syncUninterruptibly();
      return $$3;
   }

   public static ChannelFuture a(InetSocketAddress $$0, boolean $$1, final uq $$2) {
      Class<? extends SocketChannel> $$3;
      EventLoopGroup $$4;
      if (Epoll.isAvailable() && $$1) {
         $$3 = EpollSocketChannel.class;
         $$4 = (EventLoopGroup)f.get();
      } else {
         $$3 = NioSocketChannel.class;
         $$4 = (EventLoopGroup)e.get();
      }

      return ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group($$4)).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            ChannelPipeline $$1 = $$0.pipeline().addLast("timeout", new ReadTimeoutHandler(30));
            uq.a($$1, ya.b, $$2.B);
            $$2.a($$1);
         }
      })).channel($$3)).connect($$0.getAddress(), $$0.getPort());
   }

   private static String b(boolean $$0) {
      return $$0 ? "encoder" : "outbound_config";
   }

   private static String c(boolean $$0) {
      return $$0 ? "decoder" : "inbound_config";
   }

   public void a(ChannelPipeline $$0) {
      $$0.addLast("hackfix", new ChannelOutboundHandlerAdapter() {
         public void write(ChannelHandlerContext $$0, Object $$1, ChannelPromise $$2) throws Exception {
            super.write($$0, $$1, $$2);
         }
      }).addLast("packet_handler", this);
   }

   public static void a(ChannelPipeline $$0, ya $$1, @Nullable uj $$2) {
      ya $$3 = $$1.a();
      boolean $$4 = $$1 == ya.a;
      boolean $$5 = $$3 == ya.a;
      $$0.addLast("splitter", new vl($$2))
         .addLast(new ChannelHandler[]{new FlowControlHandler()})
         .addLast(c($$4), (ChannelHandler)($$4 ? new uw<agy>(j) : new vh.a()))
         .addLast("prepender", new vm())
         .addLast(b($$5), (ChannelHandler)($$5 ? new ux<agy>(j) : new vh.c()));
   }

   public static void a(ChannelPipeline $$0, ya $$1) {
      a($$0, $$1, null);
   }

   public static uq a(SocketAddress $$0) {
      final uq $$1 = new uq(ya.b);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)g.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            ChannelPipeline $$1 = $$0.pipeline();
            uq.a($$1, ya.b);
            $$1.a($$1);
         }
      })).channel(LocalChannel.class)).connect($$0).syncUninterruptibly();
      return $$1;
   }

   public void a(Cipher $$0, Cipher $$1) {
      this.s = true;
      this.n.pipeline().addBefore("splitter", "decrypt", new ul($$0));
      this.n.pipeline().addBefore("prepender", "encrypt", new um($$1));
   }

   public boolean h() {
      return this.s;
   }

   public boolean i() {
      return this.n != null && this.n.isOpen();
   }

   public boolean j() {
      return this.n == null;
   }

   @Nullable
   public uy k() {
      return this.q;
   }

   @Nullable
   public vs l() {
      return this.r;
   }

   public void m() {
      if (this.n != null) {
         this.n.config().setAutoRead(false);
      }
   }

   public void a(int $$0, boolean $$1) {
      if ($$0 >= 0) {
         if (this.n.pipeline().get("decompress") instanceof uo $$2) {
            $$2.a($$0, $$1);
         } else {
            this.n.pipeline().addAfter("splitter", "decompress", new uo($$0, $$1));
         }

         if (this.n.pipeline().get("compress") instanceof up $$3) {
            $$3.a($$0);
         } else {
            this.n.pipeline().addAfter("prepender", "compress", new up($$0));
         }
      } else {
         if (this.n.pipeline().get("decompress") instanceof uo) {
            this.n.pipeline().remove("decompress");
         }

         if (this.n.pipeline().get("compress") instanceof up) {
            this.n.pipeline().remove("compress");
         }
      }
   }

   public void n() {
      if (this.n != null && !this.n.isOpen()) {
         if (this.t) {
            i.warn("handleDisconnection() called twice");
         } else {
            this.t = true;
            uy $$0 = this.k();
            uy $$1 = $$0 != null ? $$0 : this.p;
            if ($$1 != null) {
               vs $$2 = Objects.requireNonNullElseGet(this.l(), () -> vs.c("multiplayer.disconnect.generic"));
               $$1.a($$2);
            }
         }
      }
   }

   public float o() {
      return this.w;
   }

   public float p() {
      return this.x;
   }

   public void a(bii $$0) {
      this.B = new uj($$0);
   }
}
