import com.google.common.base.Suppliers;
import com.google.common.collect.Queues;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
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

public class sg extends SimpleChannelInboundHandler<ux<?>> {
   private static final float j = 0.75F;
   private static final Logger k = LogUtils.getLogger();
   public static final Marker a = MarkerFactory.getMarker("NETWORK");
   public static final Marker b = ac.a(MarkerFactory.getMarker("NETWORK_PACKETS"), $$0 -> $$0.add(a));
   public static final Marker c = ac.a(MarkerFactory.getMarker("PACKET_RECEIVED"), $$0 -> $$0.add(b));
   public static final Marker d = ac.a(MarkerFactory.getMarker("PACKET_SENT"), $$0 -> $$0.add(b));
   public static final AttributeKey<sh.a<?>> e = AttributeKey.valueOf("serverbound_protocol");
   public static final AttributeKey<sh.a<?>> f = AttributeKey.valueOf("clientbound_protocol");
   public static final Supplier<NioEventLoopGroup> g = Suppliers.memoize(
      () -> new NioEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Client IO #%d").setDaemon(true).build())
   );
   public static final Supplier<EpollEventLoopGroup> h = Suppliers.memoize(
      () -> new EpollEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Epoll Client IO #%d").setDaemon(true).build())
   );
   public static final Supplier<DefaultEventLoopGroup> i = Suppliers.memoize(
      () -> new DefaultEventLoopGroup(0, new ThreadFactoryBuilder().setNameFormat("Netty Local Client IO #%d").setDaemon(true).build())
   );
   private final uy l;
   private final Queue<Consumer<sg>> m = Queues.newConcurrentLinkedQueue();
   private Channel n;
   private SocketAddress o;
   @Nullable
   private volatile so p;
   @Nullable
   private volatile so q;
   @Nullable
   private tf r;
   private boolean s;
   private boolean t;
   private int u;
   private int v;
   private float w;
   private float x;
   private int y;
   private boolean z;
   @Nullable
   private volatile tf A;
   @Nullable
   ry B;

   public sg(uy $$0) {
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
      $$0.attr(e).set(sh.a.b(uy.a));
      $$0.attr(f).set(sh.a.b(uy.b));
   }

   public void channelInactive(ChannelHandlerContext $$0) {
      this.a(tf.c("disconnect.endOfStream"));
   }

   public void exceptionCaught(ChannelHandlerContext $$0, Throwable $$1) {
      if ($$1 instanceof st) {
         k.debug("Skipping packet due to errors", $$1.getCause());
      } else {
         boolean $$2 = !this.z;
         this.z = true;
         if (this.n.isOpen()) {
            if ($$1 instanceof TimeoutException) {
               k.debug("Timeout", $$1);
               this.a(tf.c("disconnect.timeout"));
            } else {
               tf $$3 = tf.a("disconnect.genericReason", "Internal Exception: " + $$1);
               if ($$2) {
                  k.debug("Failed to sent packet", $$1);
                  if (this.i() == uy.b) {
                     sh $$4 = ((sh.a)this.n.attr(f).get()).a();
                     ux<?> $$5 = (ux<?>)($$4 == sh.d ? new ade($$3) : new vc($$3));
                     this.a($$5, sp.a(() -> this.a($$3)));
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

   protected void a(ChannelHandlerContext $$0, ux<?> $$1) {
      if (this.n.isOpen()) {
         so $$2 = this.q;
         if ($$2 == null) {
            throw new IllegalStateException("Received a packet before the packet listener was initialized");
         } else {
            if ($$2.a($$1)) {
               try {
                  a($$1, $$2);
               } catch (afc var5) {
               } catch (RejectedExecutionException var6) {
                  this.a(tf.c("multiplayer.disconnect.server_shutdown"));
               } catch (ClassCastException var7) {
                  k.error("Received {} that couldn't be processed", $$1.getClass(), var7);
                  this.a(tf.c("multiplayer.disconnect.invalid_packet"));
               }

               this.u++;
            }
         }
      }
   }

   private static <T extends so> void a(ux<T> $$0, so $$1) {
      $$0.a((T)$$1);
   }

   public void a() {
      this.n.config().setAutoRead(false);
   }

   public void b() {
      this.n.config().setAutoRead(true);
   }

   public void a(so $$0) {
      Validate.notNull($$0, "packetListener", new Object[0]);
      uy $$1 = $$0.a();
      if ($$1 != this.l) {
         throw new IllegalStateException("Trying to set listener for wrong side: connection is " + this.l + ", but listener is " + $$1);
      } else {
         sh $$2 = $$0.b();
         sh $$3 = ((sh.a)this.n.attr(a($$1)).get()).a();
         if ($$3 != $$2) {
            throw new IllegalStateException("Trying to set listener for protocol " + $$2.a() + ", but current " + $$1 + " protocol is " + $$3.a());
         } else {
            this.q = $$0;
            this.p = null;
         }
      }
   }

   public void b(so $$0) {
      if (this.q != null) {
         throw new IllegalStateException("Listener already set");
      } else if (this.l == uy.a && $$0.a() == uy.a && $$0.b() == sh.a) {
         this.q = $$0;
      } else {
         throw new IllegalStateException("Invalid initial listener");
      }
   }

   public void a(String $$0, int $$1, adr $$2) {
      this.a($$0, $$1, $$2, acv.a);
   }

   public void a(String $$0, int $$1, acz $$2) {
      this.a($$0, $$1, $$2, acv.b);
   }

   private void a(String $$0, int $$1, so $$2, acv $$3) {
      this.p = $$2;
      this.a((Consumer<sg>)($$4 -> {
         $$4.a($$3);
         this.a($$2);
         $$4.b(new acw(aa.b().e(), $$0, $$1, $$3), null, true);
      }));
   }

   public void a(acv $$0) {
      this.n.attr(f).set($$0.b().b(uy.b));
   }

   public void a(ux<?> $$0) {
      this.a($$0, null);
   }

   public void a(ux<?> $$0, @Nullable sp $$1) {
      this.a($$0, $$1, true);
   }

   public void a(ux<?> $$0, @Nullable sp $$1, boolean $$2) {
      if (this.k()) {
         this.t();
         this.b($$0, $$1, $$2);
      } else {
         this.m.add($$3 -> $$3.b($$0, $$1, $$2));
      }
   }

   public void a(Consumer<sg> $$0) {
      if (this.k()) {
         this.t();
         $$0.accept(this);
      } else {
         this.m.add($$0);
      }
   }

   private void b(ux<?> $$0, @Nullable sp $$1, boolean $$2) {
      this.v++;
      if (this.n.eventLoop().inEventLoop()) {
         this.c($$0, $$1, $$2);
      } else {
         this.n.eventLoop().execute(() -> this.c($$0, $$1, $$2));
      }
   }

   private void c(ux<?> $$0, @Nullable sp $$1, boolean $$2) {
      ChannelFuture $$3 = $$2 ? this.n.writeAndFlush($$0) : this.n.write($$0);
      if ($$1 != null) {
         $$3.addListener($$1x -> {
            if ($$1x.isSuccess()) {
               $$1.a();
            } else {
               ux<?> $$2x = $$1.b();
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
         this.m.add(sg::s);
      }
   }

   private void s() {
      if (this.n.eventLoop().inEventLoop()) {
         this.n.flush();
      } else {
         this.n.eventLoop().execute(() -> this.n.flush());
      }
   }

   private static AttributeKey<sh.a<?>> a(uy $$0) {
      return switch ($$0) {
         case b -> f;
         case a -> e;
      };
   }

   private void t() {
      if (this.n != null && this.n.isOpen()) {
         synchronized (this.m) {
            Consumer<sg> $$0;
            while (($$0 = this.m.poll()) != null) {
               $$0.accept(this);
            }
         }
      }
   }

   public void d() {
      this.t();
      if (this.q instanceof su $$0) {
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
      this.x = arp.i(0.75F, (float)this.v, this.x);
      this.w = arp.i(0.75F, (float)this.u, this.w);
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

   public void a(tf $$0) {
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

   public uy h() {
      return this.l;
   }

   public uy i() {
      return this.l.a();
   }

   public static sg a(InetSocketAddress $$0, boolean $$1, @Nullable arw $$2) {
      sg $$3 = new sg(uy.b);
      if ($$2 != null) {
         $$3.a($$2);
      }

      ChannelFuture $$4 = a($$0, $$1, $$3);
      $$4.syncUninterruptibly();
      return $$3;
   }

   public static ChannelFuture a(InetSocketAddress $$0, boolean $$1, final sg $$2) {
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
            sg.a($$0);

            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            ChannelPipeline $$1 = $$0.pipeline().addLast("timeout", new ReadTimeoutHandler(30));
            sg.a($$1, uy.b, $$2.B);
            $$1.addLast("packet_handler", $$2);
         }
      })).channel($$3)).connect($$0.getAddress(), $$0.getPort());
   }

   public static void a(ChannelPipeline $$0, uy $$1, @Nullable ry $$2) {
      uy $$3 = $$1.a();
      AttributeKey<sh.a<?>> $$4 = a($$1);
      AttributeKey<sh.a<?>> $$5 = a($$3);
      $$0.addLast("splitter", new sy($$2))
         .addLast("decoder", new sl($$4))
         .addLast("prepender", new sz())
         .addLast("encoder", new sm($$5))
         .addLast("unbundler", new sk($$5))
         .addLast("bundler", new sj($$4));
   }

   private static void b(ChannelPipeline $$0, uy $$1) {
      uy $$2 = $$1.a();
      AttributeKey<sh.a<?>> $$3 = a($$1);
      AttributeKey<sh.a<?>> $$4 = a($$2);
      $$0.addLast("validator", new sn($$3, $$4));
   }

   public static void a(ChannelPipeline $$0, uy $$1) {
      b($$0, $$1);
   }

   public static sg a(SocketAddress $$0) {
      final sg $$1 = new sg(uy.b);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)i.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            sg.a($$0);
            ChannelPipeline $$1 = $$0.pipeline();
            sg.a($$1, uy.b);
            $$1.addLast("packet_handler", $$1);
         }
      })).channel(LocalChannel.class)).connect($$0).syncUninterruptibly();
      return $$1;
   }

   public void a(Cipher $$0, Cipher $$1) {
      this.s = true;
      this.n.pipeline().addBefore("splitter", "decrypt", new sa($$0));
      this.n.pipeline().addBefore("prepender", "encrypt", new sb($$1));
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
   public so m() {
      return this.q;
   }

   @Nullable
   public tf n() {
      return this.r;
   }

   public void o() {
      if (this.n != null) {
         this.n.config().setAutoRead(false);
      }
   }

   public void a(int $$0, boolean $$1) {
      if ($$0 >= 0) {
         if (this.n.pipeline().get("decompress") instanceof se) {
            ((se)this.n.pipeline().get("decompress")).a($$0, $$1);
         } else {
            this.n.pipeline().addBefore("decoder", "decompress", new se($$0, $$1));
         }

         if (this.n.pipeline().get("compress") instanceof sf) {
            ((sf)this.n.pipeline().get("compress")).a($$0);
         } else {
            this.n.pipeline().addBefore("encoder", "compress", new sf($$0));
         }
      } else {
         if (this.n.pipeline().get("decompress") instanceof se) {
            this.n.pipeline().remove("decompress");
         }

         if (this.n.pipeline().get("compress") instanceof sf) {
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
            so $$0 = this.m();
            so $$1 = $$0 != null ? $$0 : this.p;
            if ($$1 != null) {
               tf $$2 = Objects.requireNonNullElseGet(this.n(), () -> tf.c("multiplayer.disconnect.generic"));
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

   public void a(arw $$0) {
      this.B = new ry($$0);
   }
}
