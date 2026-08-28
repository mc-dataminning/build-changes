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

public class gju {
   private static final Logger a = LogUtils.getLogger();
   private static final ww b = ww.c("multiplayer.status.cannot_connect").b(-65536);
   private final List<vp> c = Collections.synchronizedList(Lists.newArrayList());

   public void a(final gjs $$0, final Runnable $$1, final Runnable $$2) throws UnknownHostException {
      final gkv $$3 = gkv.a($$0.b);
      Optional<InetSocketAddress> $$4 = gkx.a.a($$3).map(gku::d);
      if ($$4.isEmpty()) {
         this.a(fwh.b, $$0);
      } else {
         final InetSocketAddress $$5 = $$4.get();
         final vp $$6 = vp.a($$5, false, null);
         this.c.add($$6);
         $$0.d = ww.c("multiplayer.status.pinging");
         $$0.i = Collections.emptyList();
         ajz $$7 = new ajz() {
            private boolean h;
            private boolean i;
            private long j;

            @Override
            public void a(aka $$0x) {
               if (this.i) {
                  $$6.a(ww.c("multiplayer.status.unrequested"));
               } else {
                  this.i = true;
                  akb $$1 = $$0.b();
                  $$0.d = $$1.a();
                  $$1.c().ifPresentOrElse($$1xxx -> {
                     $$0.h = ww.b($$1xxx.b());
                     $$0.g = $$1xxx.c();
                  }, () -> {
                     $$0.h = ww.c("multiplayer.status.old");
                     $$0.g = 0;
                  });
                  $$1.b().ifPresentOrElse($$1xxx -> {
                     $$0.c = gju.a($$1xxx.b(), $$1xxx.a());
                     $$0.e = $$1xxx;
                     if (!$$1xxx.c().isEmpty()) {
                        List<ww> $$2xx = new ArrayList<>($$1xxx.c().size());

                        for (GameProfile $$3xx : $$1xxx.c()) {
                           $$2xx.add(ww.b($$3xx.getName()));
                        }

                        if ($$1xxx.c().size() < $$1xxx.b()) {
                           $$2xx.add(ww.a("multiplayer.status.and_more", $$1xxx.b() - $$1xxx.c().size()));
                        }

                        $$0.i = $$2xx;
                     } else {
                        $$0.i = List.of();
                     }
                  }, () -> $$0.c = ww.c("multiplayer.status.unknown").a(n.i));
                  $$1.d().ifPresent($$2xx -> {
                     if (!Arrays.equals($$2xx.a(), $$0.c())) {
                        $$0.a(gjs.b($$2xx.a()));
                        $$1.run();
                     }
                  });
                  this.j = af.c();
                  $$6.a(new ajx(this.j));
                  this.h = true;
               }
            }

            @Override
            public void a(aju $$0x) {
               long $$1 = this.j;
               long $$2 = af.c();
               $$0.f = $$2 - $$1;
               $$6.a(ww.c("multiplayer.status.finished"));
               $$2.run();
            }

            @Override
            public void a(vr $$0x) {
               if (!this.h) {
                  gju.this.a($$0.a(), $$0);
                  gju.this.a($$5, $$3, $$0);
               }
            }

            @Override
            public boolean c() {
               return $$6.i();
            }
         };

         try {
            $$6.a($$3.a(), $$3.b(), $$7);
            $$6.a(akd.a);
         } catch (Throwable var10) {
            a.error("Failed to ping server {}", $$3, var10);
         }
      }
   }

   void a(ww $$0, gjs $$1) {
      a.error("Can't ping {}: {}", $$1.b, $$0.getString());
      $$1.d = b;
      $$1.c = wv.a;
   }

   void a(InetSocketAddress $$0, final gkv $$1, final gjs $$2) {
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)vp.e.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            $$0.pipeline().addLast(new ChannelHandler[]{new gjl($$1, ($$1xx, $$2xx, $$3, $$4, $$5) -> {
               $$2.a(gjs.b.d);
               $$2.h = ww.b($$2xx);
               $$2.d = ww.b($$3);
               $$2.c = gju.a($$4, $$5);
               $$2.e = new akb.b($$5, $$4, List.of());
            })});
         }
      })).channel(NioSocketChannel.class)).connect($$0.getAddress(), $$0.getPort());
   }

   public static ww a(int $$0, int $$1) {
      ww $$2 = ww.b(Integer.toString($$0)).a(n.h);
      ww $$3 = ww.b(Integer.toString($$1)).a(n.h);
      return ww.a("multiplayer.status.player_count", $$2, $$3).a(n.i);
   }

   public void a() {
      synchronized (this.c) {
         Iterator<vp> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            vp $$1 = $$0.next();
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
         Iterator<vp> $$0 = this.c.iterator();

         while ($$0.hasNext()) {
            vp $$1 = $$0.next();
            if ($$1.i()) {
               $$0.remove();
               $$1.a(ww.c("multiplayer.status.cancelled"));
            }
         }
      }
   }
}
