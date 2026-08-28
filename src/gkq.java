import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class gkq {
   private static final Logger a = LogUtils.getLogger();
   private static final wy b = wy.c("multiplayer.status.cannot_connect").b(-65536);
   private final List<vr> c = Collections.synchronizedList(Lists.newArrayList());

   public void a(final gko $$0, final Runnable $$1, final Runnable $$2) throws UnknownHostException {
      final glr $$3 = glr.a($$0.b);
      Optional<InetSocketAddress> $$4 = glt.a.a($$3).map(glq::d);
      if ($$4.isEmpty()) {
         this.a(fxa.b, $$0);
      } else {
         final InetSocketAddress $$5 = $$4.get();
         final vr $$6 = vr.a($$5, false, null);
         this.c.add($$6);
         $$0.d = wy.c("multiplayer.status.pinging");
         $$0.i = Collections.emptyList();
         akb $$7 = new akb() {
            private boolean h;
            private boolean i;
            private long j;

            @Override
            public void a(akc $$0x) {
               if (this.i) {
                  $$6.a(wy.c("multiplayer.status.unrequested"));
               } else {
                  this.i = true;
                  akd $$1 = $$0.b();
                  $$0.d = $$1.a();
                  $$1.c().ifPresentOrElse($$1xxx -> {
                     $$0.h = wy.b($$1xxx.b());
                     $$0.g = $$1xxx.c();
                  }, () -> {
                     $$0.h = wy.c("multiplayer.status.old");
                     $$0.g = 0;
                  });
                  $$1.b().ifPresentOrElse($$1xxx -> {
                     $$0.c = gkq.a($$1xxx.b(), $$1xxx.a());
                     $$0.e = $$1xxx;
                     if (!$$1xxx.c().isEmpty()) {
                        List<wy> $$2xx = new ArrayList<>($$1xxx.c().size());

                        for (GameProfile $$3xx : $$1xxx.c()) {
                           $$2xx.add(wy.b($$3xx.getName()));
                        }

                        if ($$1xxx.c().size() < $$1xxx.b()) {
                           $$2xx.add(wy.a("multiplayer.status.and_more", $$1xxx.b() - $$1xxx.c().size()));
                        }

                        $$0.i = $$2xx;
                     } else {
                        $$0.i = List.of();
                     }
                  }, () -> $$0.c = wy.c("multiplayer.status.unknown").a(n.i));
                  $$1.d().ifPresent($$2xx -> {
                     if (!Arrays.equals($$2xx.a(), $$0.c())) {
                        $$0.a(gko.b($$2xx.a()));
                        $$1.run();
                     }
                  });
                  this.j = af.c();
                  $$6.a(new ajz(this.j));
                  this.h = true;
               }
            }

            @Override
            public void a(ajw $$0x) {
               long $$1 = this.j;
               long $$2 = af.c();
               $$0.f = $$2 - $$1;
               $$6.a(wy.c("multiplayer.status.finished"));
               $$2.run();
            }

            @Override
            public void a(vt $$0x) {
               if (!this.h) {
                  gkq.this.a($$0.a(), $$0);
                  gkq.this.a($$5, $$3, $$0);
               }
            }

            @Override
            public boolean c() {
               return $$6.i();
            }
         };

         try {
            $$6.a($$3.a(), $$3.b(), $$7);
            $$6.a(akf.a);
         } catch (Throwable var10) {
            a.error("Failed to ping server {}", $$3, var10);
         }
      }
   }

   void a(wy $$0, gko $$1) {
      a.error("Can't ping {}: {}", $$1.b, $$0.getString());
      $$1.d = b;
      $$1.c = wx.a;
   }

   void a(InetSocketAddress $$0, final glr $$1, final gko $$2) {
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)vr.e.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            $$0.pipeline().addLast(new ChannelHandler[]{new gkh($$1, ($$1xx, $$2xx, $$3, $$4, $$5) -> {
               $$2.a(gko.b.d);
               $$2.h = wy.b($$2xx);
               $$2.d = wy.b($$3);
               $$2.c = gkq.a($$4, $$5);
               $$2.e = new akd.b($$5, $$4, List.of());
            })});
         }
      })).channel(NioSocketChannel.class)).connect($$0.getAddress(), $$0.getPort());
   }

   public static wy a(int $$0, int $$1) {
      wy $$2 = wy.b(Integer.toString($$0)).a(n.h);
      wy $$3 = wy.b(Integer.toString($$1)).a(n.h);
      return wy.a("multiplayer.status.player_count", $$2, $$3).a(n.i);
   }

   public void a() {
      synchronized (this.c) {
         Iterator<vr> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            vr $$1 = $$0.next();
            if ($$1.i()) {
               $$1.b();
            } else {
               $$0.remove();
               $$1.n();
            }
         }
      }
   }

   public void b() {
      synchronized (this.c) {
         Iterator<vr> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            vr $$1 = $$0.next();
            if ($$1.i()) {
               $$0.remove();
               $$1.a(wy.c("multiplayer.status.cancelled"));
            }
         }
      }
   }
}
