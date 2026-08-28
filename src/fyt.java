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

public class fyt {
   private static final Logger a = LogUtils.getLogger();
   private static final wu b = wu.c("multiplayer.status.cannot_connect").b(-65536);
   private final List<vp> c = Collections.synchronizedList(Lists.newArrayList());

   public void a(final fyr $$0, final Runnable $$1, final Runnable $$2) throws UnknownHostException {
      final fzv $$3 = fzv.a($$0.b);
      Optional<InetSocketAddress> $$4 = fzx.a.a($$3).map(fzu::d);
      if ($$4.isEmpty()) {
         this.a(fmc.b, $$0);
      } else {
         final InetSocketAddress $$5 = $$4.get();
         final vp $$6 = vp.a($$5, false, null);
         this.c.add($$6);
         $$0.d = wu.c("multiplayer.status.pinging");
         $$0.i = Collections.emptyList();
         ajh $$7 = new ajh() {
            private boolean h;
            private boolean i;
            private long j;

            @Override
            public void a(aji $$0x) {
               if (this.i) {
                  $$6.a(wu.c("multiplayer.status.unrequested"));
               } else {
                  this.i = true;
                  ajj $$1 = $$0.b();
                  $$0.d = $$1.a();
                  $$1.c().ifPresentOrElse($$1xxx -> {
                     $$0.h = wu.b($$1xxx.b());
                     $$0.g = $$1xxx.c();
                  }, () -> {
                     $$0.h = wu.c("multiplayer.status.old");
                     $$0.g = 0;
                  });
                  $$1.b().ifPresentOrElse($$1xxx -> {
                     $$0.c = fyt.a($$1xxx.b(), $$1xxx.a());
                     $$0.e = $$1xxx;
                     if (!$$1xxx.c().isEmpty()) {
                        List<wu> $$2xx = new ArrayList<>($$1xxx.c().size());

                        for (GameProfile $$3xx : $$1xxx.c()) {
                           $$2xx.add(wu.b($$3xx.getName()));
                        }

                        if ($$1xxx.c().size() < $$1xxx.b()) {
                           $$2xx.add(wu.a("multiplayer.status.and_more", $$1xxx.b() - $$1xxx.c().size()));
                        }

                        $$0.i = $$2xx;
                     } else {
                        $$0.i = List.of();
                     }
                  }, () -> $$0.c = wu.c("multiplayer.status.unknown").a(n.i));
                  $$1.d().ifPresent($$2xx -> {
                     if (!Arrays.equals($$2xx.a(), $$0.c())) {
                        $$0.a(fyr.b($$2xx.a()));
                        $$1.run();
                     }
                  });
                  this.j = ac.c();
                  $$6.a(new ajf(this.j));
                  this.h = true;
               }
            }

            @Override
            public void a(ajc $$0x) {
               long $$1 = this.j;
               long $$2 = ac.c();
               $$0.f = $$2 - $$1;
               $$6.a(wu.c("multiplayer.status.finished"));
               $$2.run();
            }

            @Override
            public void a(wu $$0x) {
               if (!this.h) {
                  fyt.this.a($$0, $$0);
                  fyt.this.a($$5, $$3, $$0);
               }
            }

            @Override
            public boolean c() {
               return $$6.i();
            }
         };

         try {
            $$6.a($$3.a(), $$3.b(), $$7);
            $$6.a(ajl.a);
         } catch (Throwable var10) {
            a.error("Failed to ping server {}", $$3, var10);
         }
      }
   }

   void a(wu $$0, fyr $$1) {
      a.error("Can't ping {}: {}", $$1.b, $$0.getString());
      $$1.d = b;
      $$1.c = wt.a;
   }

   void a(InetSocketAddress $$0, final fzv $$1, final fyr $$2) {
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)vp.e.get())).handler(new ChannelInitializer<Channel>() {
         protected void initChannel(Channel $$0) {
            try {
               $$0.config().setOption(ChannelOption.TCP_NODELAY, true);
            } catch (ChannelException var3) {
            }

            $$0.pipeline().addLast(new ChannelHandler[]{new fyk($$1, ($$1xx, $$2xx, $$3, $$4, $$5) -> {
               $$2.a(fyr.b.d);
               $$2.h = wu.b($$2xx);
               $$2.d = wu.b($$3);
               $$2.c = fyt.a($$4, $$5);
               $$2.e = new ajj.b($$5, $$4, List.of());
            })});
         }
      })).channel(NioSocketChannel.class)).connect($$0.getAddress(), $$0.getPort());
   }

   public static wu a(int $$0, int $$1) {
      wu $$2 = wu.b(Integer.toString($$0)).a(n.h);
      wu $$3 = wu.b(Integer.toString($$1)).a(n.h);
      return wu.a("multiplayer.status.player_count", $$2, $$3).a(n.i);
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
               $$1.a(wu.c("multiplayer.status.cancelled"));
            }
         }
      }
   }
}
