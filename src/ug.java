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
import io.netty.channel.ChannelPipeline;
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
import io.netty.util.AttributeKey;
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

public class ug extends SimpleChannelInboundHandler<xf<?>> {
   private static final float j = 0.75F;
   private static final Logger k = LogUtils.getLogger();
   public static final Marker a = MarkerFactory.getMarker("NETWORK");
   public static final Marker b = ac.a(MarkerFactory.getMarker("NETWORK_PACKETS"), $$0 -> $$0.add(a));
   public static final Marker c = ac.a(MarkerFactory.getMarker("PACKET_RECEIVED"), $$0 -> $$0.add(b));
   public static final Marker d = ac.a(MarkerFactory.getMarker("PACKET_SENT"), $$0 -> $$0.add(b));
   public static final AttributeKey<uh.a<?>> e = AttributeKey.valueOf("serverbound_protocol");
   public static final AttributeKey<uh.a<?>> f = AttributeKey.valueOf("clientbound_protocol");
   public static final Supplier<NioEventLoopGroup> g = Suppliers.memoize(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build())
   );
   public static final Supplier<EpollEventLoopGroup> h = Suppliers.memoize(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build())
   );
   public static final Supplier<DefaultEventLoopGroup> i = Suppliers.memoize(
      () -> new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build())
   );
   private final xg l;
   private final Queue<Consumer<ug>> m = Queues.newConcurrentLinkedQueue();
   private Channel n;
   private SocketAddress o;
   @Nullable
   private volatile uo p;
   @Nullable
   private volatile uo q;
   @Nullable
   private vf r;
   private boolean s;
   private boolean t;
   private int u;
   private int v;
   private float w;
   private float x;
   private int y;
   private boolean z;
   @Nullable
   private volatile vf A;
   @Nullable
   ty B;

   public ug(xg $$0) {
      this.l = $$0;
   }

   public void channelActive(ChannelHandlerContext $$0) throws Exception {
      super.channelActive($$0);
      this.n = $$0.channel();
      this.o = this.n.remoteAddress();
      if (this.A != null) {
         this.a(this.A);
      }
   }

   public static void a(Channel $$0) {
      $$0.attr(e).set(uh.a.b(xg.a));
      $$0.attr(f).set(uh.a.b(xg.b));
   }

   public void channelInactive(ChannelHandlerContext $$0) {
      this.a(vf.c("disconnect.endOfStream"));
   }

   public void exceptionCaught(ChannelHandlerContext $$0, Throwable $$1) {
      if ($$1 instanceof ut) {
         k.debug("Skipping packet due to errors", $$1.getCause());
      } else {
         boolean $$2 = !this.z;
         this.z = true;
         if (this.n.isOpen()) {
            if ($$1 instanceof TimeoutException) {
               k.debug("Timeout", $$1);
               this.a(vf.c("disconnect.timeout"));
            } else {
               vf $$3 = vf.a("disconnect.genericReason", "Internal Exception: " + $$1);
               if ($$2) {
                  k.debug("Failed to sent packet", $$1);
                  if (this.i() == xg.b) {
                     uh $$4 = ((uh.a)this.n.attr(f).get()).a();
                     xf<?> $$5 = (xf<?>)($$4 == uh.d ? new afr($$3) : new xk($$3));
                     this.a($$5, up.a(() -> this.a($$3)));
                  } else {
                     this.a($$3);
                  }

                  this.o();
               } else {
                  k.debug("Double fault", $$1);
                  this.a($$3);
               }
            }
         }
      }
   }

   protected void a(ChannelHandlerContext $$0, xf<?> $$1) {
      if (this.n.isOpen()) {
         uo $$2 = this.q;
         if ($$2 == null) {
            throw new IllegalStateException("Received a packet before the packet listener was initialized");
         } else {
            if ($$2.a($$1)) {
               try {
                  a($$1, $$2);
               } catch (ahr var5) {
               } catch (RejectedExecutionException var6) {
                  this.a(vf.c("multiplayer.disconnect.server_shutdown"));
               } catch (ClassCastException var7) {
                  k.error("Received {} that couldn't be processed", $$1.getClass(), var7);
                  this.a(vf.c("multiplayer.disconnect.invalid_packet"));
               }

               this.u++;
            }
         }
      }
   }

   private static <T extends uo> void a(xf<T> $$0, uo $$1) {
      $$0.a((T)$$1);
   }

   public void a() {
      this.n.config().setAutoRead(false);
   }

   public void b() {
      this.n.config().setAutoRead(true);
   }

   public void a(uo $$0) {
      Validate.notNull($$0, "packetListener", new Object[0]);
      xg $$1 = $$0.a();
      if ($$1 != this.l) {
         throw new IllegalStateException("Trying to set listener for wrong side: connection is " + this.l + ", but listener is " + $$1);
      } else {
         uh $$2 = $$0.b();
         uh $$3 = ((uh.a)this.n.attr(a($$1)).get()).a();
         if ($$3 != $$2) {
            throw new IllegalStateException("Trying to set listener for protocol " + $$2.a() + ", but current " + $$1 + " protocol is " + $$3.a());
         } else {
            this.q = $$0;
            this.p = null;
         }
      }
   }

   public void b(uo $$0) {
      if (this.q != null) {
         throw new IllegalStateException("Listener already set");
      } else if (this.l == xg.a && $$0.a() == xg.a && $$0.b() == uh.a) {
         this.q = $$0;
      } else {
         throw new IllegalStateException("Invalid initial listener");
      }
   }

   public void a(String $$0, int $$1, age $$2) {
      this.a($$0, $$1, $$2, afi.a);
   }

   public void a(String $$0, int $$1, afm $$2) {
      this.a($$0, $$1, $$2, afi.b);
   }

   private void a(String $$0, int $$1, uo $$2, afi $$3) {
      this.p = $$2;
      this.a((Consumer<ug>)($$4 -> {
         $$4.a($$3);
         this.a($$2);
         $$4.b(new afj(aa.b().e(), $$0, $$1, $$3), null, true);
      }));
   }

   public void a(afi $$0) {
      this.n.attr(f).set($$0.b().b(xg.b));
   }

   public void a(xf<?> $$0) {
      this.a($$0, null);
   }

   public void a(xf<?> $$0, @Nullable up $$1) {
      this.a($$0, $$1, true);
   }

   public void a(xf<?> $$0, @Nullable up $$1, boolean $$2) {
      if (this.k()) {
         this.t();
         this.b($$0, $$1, $$2);
      } else {
         this.m.add($$3 -> $$3.b($$0, $$1, $$2));
      }
   }

   public void a(Consumer<ug> $$0) {
      if (this.k()) {
         this.t();
         $$0.accept(this);
      } else {
         this.m.add($$0);
      }
   }

   private void b(xf<?> $$0, @Nullable up $$1, boolean $$2) {
      this.v++;
      if (this.n.eventLoop().inEventLoop()) {
         this.c($$0, $$1, $$2);
      } else {
         this.n.eventLoop().execute(() -> this.c($$0, $$1, $$2));
      }
   }

   private void c(xf<?> $$0, @Nullable up $$1, boolean $$2) {
      ChannelFuture $$3 = $$2 ? this.n.writeAndFlush($$0) : this.n.write($$0);
      if ($$1 != null) {
         $$3.addListener($$1x -> {
            if ($$1x.isSuccess()) {
               $$1.a();
            } else {
               xf<?> $$2x = $$1.b();
               if ($$2x != null) {
                  ChannelFuture $$3x = this.n.writeAndFlush($$2x);
                  $$3x.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
               }
            }
         });
      }

      $$3.addListener(ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
   }

   public void c() {
      if (this.k()) {
         this.s();
      } else {
         this.m.add(ug::s);
      }
   }

   private void s() {
      if (this.n.eventLoop().inEventLoop()) {
         this.n.flush();
      } else {
         this.n.eventLoop().execute(() -> this.n.flush());
      }
   }

   private static AttributeKey<uh.a<?>> a(xg $$0) {
      return switch ($$0) {
         case b -> f;
         case a -> e;
      };
   }

   private void t() {
      if (this.n != null && this.n.isOpen()) {
         synchronized (this.m) {
            Consumer<ug> $$0;
            while (($$0 = this.m.poll()) != null) {
               $$0.accept(this);
            }
         }
      }
   }

   public void d() {
      this.t();
      if (this.q instanceof uu $$0) {
         $$0.e();
      }

      if (!this.k() && !this.t) {
         this.p();
      }

      if (this.n != null) {
         this.n.flush();
      }

      if (this.y++ % 20 == 0) {
         this.e();
      }

      if (this.B != null) {
         this.B.a();
      }
   }

   protected void e() {
      this.x = aun.i(0.75F, (float)this.v, this.x);
      this.w = aun.i(0.75F, (float)this.u, this.w);
      this.v = 0;
      this.u = 0;
   }

   public SocketAddress f() {
      return this.o;
   }

   public String a(boolean $$0) {
      if (this.o == null) {
         return "local";
      } else {
         return $$0 ? this.o.toString() : "IP hidden";
      }
   }

   public void a(vf $$0) {
      if (this.n == null) {
         this.A = $$0;
      }

      if (this.k()) {
         this.n.close().awaitUninterruptibly();
         this.r = $$0;
      }
   }

   public boolean g() {
      return this.n instanceof LocalChannel || this.n instanceof LocalServerChannel;
   }

   public xg h() {
      return this.l;
   }

   public xg i() {
      return this.l.a();
   }

   public static ug a(InetSocketAddress $$0, boolean $$1, @Nullable auw $$2) {
      ug $$3 = new ug(xg.b);
      if ($$2 != null) {
         $$3.a($$2);
      }

      ChannelFuture $$4 = a($$0, $$1, $$3);
      $$4.syncUninterruptibly();
      return $$3;
   }

   public static ChannelFuture a(InetSocketAddress $$0, boolean $$1, final ug $$2) {
      Class<? extends SocketChannel> $$3;
      EventLoopGroup $$4;
      if (Epoll.isAvailable() && $$1) {
         $$3 = EpollSocketChannel.class;
         $$4 = (EventLoopGroup)h.get();
      } else {
         $$3 = NioSocketChannel.class;
         $$4 = (EventLoopGroup)g.get();
      }

      return ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group($$4)).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            ug.a($$0);

            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            ChannelPipeline $$1 = $$0.pipeline().addLast("timeout", new ReadTimeoutHandler(30));
            ug.a($$1, xg.b, $$2.B);
            $$2.a($$1);
         }
      })).channel($$3)).connect($$0.getAddress(), $$0.getPort());
   }

   public static void a(ChannelPipeline $$0, xg $$1, @Nullable ty $$2) {
      xg $$3 = $$1.a();
      AttributeKey<uh.a<?>> $$4 = a($$1);
      AttributeKey<uh.a<?>> $$5 = a($$3);
      $$0.addLast("splitter", new uy($$2))
         .addLast("decoder", new ul($$4))
         .addLast("prepender", new uz())
         .addLast("encoder", new um($$5))
         .addLast("unbundler", new uk($$5))
         .addLast("bundler", new uj($$4));
   }

   public void a(ChannelPipeline $$0) {
      $$0.addLast(new ChannelHandler[]{new FlowControlHandler()}).addLast("packet_handler", this);
   }

   private static void b(ChannelPipeline $$0, xg $$1) {
      xg $$2 = $$1.a();
      AttributeKey<uh.a<?>> $$3 = a($$1);
      AttributeKey<uh.a<?>> $$4 = a($$2);
      $$0.addLast("validator", new un($$3, $$4));
   }

   public static void a(ChannelPipeline $$0, xg $$1) {
      b($$0, $$1);
   }

   public static ug a(SocketAddress $$0) {
      final ug $$1 = new ug(xg.b);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)i.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            ug.a($$0);
            ChannelPipeline $$1 = $$0.pipeline();
            ug.a($$1, xg.b);
            $$1.a($$1);
         }
      })).channel(LocalChannel.class)).connect($$0).syncUninterruptibly();
      return $$1;
   }

   public void a(Cipher $$0, Cipher $$1) {
      this.s = true;
      this.n.pipeline().addBefore("splitter", "decrypt", new ua($$0));
      this.n.pipeline().addBefore("prepender", "encrypt", new ub($$1));
   }

   public boolean j() {
      return this.s;
   }

   public boolean k() {
      return this.n != null && this.n.isOpen();
   }

   public boolean l() {
      return this.n == null;
   }

   @Nullable
   public uo m() {
      return this.q;
   }

   @Nullable
   public vf n() {
      return this.r;
   }

   public void o() {
      if (this.n != null) {
         this.n.config().setAutoRead(false);
      }
   }

   public void a(int $$0, boolean $$1) {
      if ($$0 >= 0) {
         if (this.n.pipeline().get("decompress") instanceof ue) {
            ((ue)this.n.pipeline().get("decompress")).a($$0, $$1);
         } else {
            this.n.pipeline().addBefore("decoder", "decompress", new ue($$0, $$1));
         }

         if (this.n.pipeline().get("compress") instanceof uf) {
            ((uf)this.n.pipeline().get("compress")).a($$0);
         } else {
            this.n.pipeline().addBefore("encoder", "compress", new uf($$0));
         }
      } else {
         if (this.n.pipeline().get("decompress") instanceof ue) {
            this.n.pipeline().remove("decompress");
         }

         if (this.n.pipeline().get("compress") instanceof uf) {
            this.n.pipeline().remove("compress");
         }
      }
   }

   public void p() {
      if (this.n != null && !this.n.isOpen()) {
         if (this.t) {
            k.warn("handleDisconnection() called twice");
         } else {
            this.t = true;
            uo $$0 = this.m();
            uo $$1 = $$0 != null ? $$0 : this.p;
            if ($$1 != null) {
               vf $$2 = Objects.requireNonNullElseGet(this.n(), () -> vf.c("multiplayer.disconnect.generic"));
               $$1.a($$2);
            }
         }
      }
   }

   public float q() {
      return this.w;
   }

   public float r() {
      return this.x;
   }

   public void a(auw $$0) {
      this.B = new ty($$0);
   }
}
