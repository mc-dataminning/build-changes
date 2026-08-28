import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class gma implements zp {
   private static final xc k = xc.c("disconnect.lost");
   private static final Logger l = LogUtils.getLogger();
   protected final frf a;
   protected final vv b;
   @Nullable
   protected final gms c;
   @Nullable
   protected String d;
   protected final hqs e;
   @Nullable
   protected final gaf f;
   protected boolean g;
   private final List<gma.a> m = new ArrayList<>();
   protected final Map<alk, byte[]> h;
   protected Map<String, String> i;
   protected amc j;

   protected gma(frf $$0, vv $$1, gmi $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
      this.i = $$2.j();
      this.j = $$2.k();
   }

   @Override
   public void a(zj $$0, Exception $$1) {
      l.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      zp.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.j.a(amc.b.a).map(amc.a::c);
      this.b.a(new vx(xc.c("disconnect.packetError"), $$2, $$3));
   }

   @Override
   public vx a(xc $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.j.a(amc.b.a).map(amc.a::c);
      return new vx($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zj $$0, Throwable $$1) {
      p $$2 = p.a($$1, "Packet handling error");
      zm.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ag.f() + "-client.txt");
      Optional<amc.a> $$5 = this.j.a(amc.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, z.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zj<?> $$0) {
      return zp.super.a($$0) ? true : this.g && ($$0 instanceof zy || $$0 instanceof zz);
   }

   @Override
   public void a(zt $$0) {
      this.a(new aaf($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zu $$0) {
      zm.a($$0, this, this.a);
      this.b(new aag($$0.b()));
   }

   @Override
   public void a(zq $$0) {
      aam $$1 = $$0.b();
      if (!($$1 instanceof aan)) {
         zm.a($$0, this, this.a);
         if ($$1 instanceof aak $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aam var1);

   @Override
   public void a(zw $$0) {
      zm.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aah($$1, aah.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         gms.a $$5 = this.c != null ? this.c.b() : gms.a.c;
         if ($$5 != gms.a.c && (!$$4 || $$5 != gms.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zv $$0) {
      zm.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static xc a(xc $$0, @Nullable xc $$1) {
      return (xc)($$1 == null ? $$0 : xc.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
   }

   @Nullable
   private static URL a(String $$0) {
      try {
         URL $$1 = new URL($$0);
         String $$2 = $$1.getProtocol();
         return !"http".equals($$2) && !"https".equals($$2) ? null : $$1;
      } catch (MalformedURLException var3) {
         return null;
      }
   }

   @Override
   public void a(abt $$0) {
      zm.a($$0, this, this.a);
      this.b.a(new abw($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(zy $$0) {
      zm.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zr $$0) {
      zm.a($$0, this, this.a);
      this.i = $$0.b();
   }

   @Override
   public void a(zx $$0) {
      zm.a($$0, this, this.a);
      List<amc.c> $$1 = $$0.b();
      Builder<amc.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (amc.c $$3 : $$1) {
         try {
            URI $$4 = ag.a($$3.b());
            $$2.add(new amc.a($$3.a(), $$4));
         } catch (Exception var7) {
            l.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.j = new amc($$2.build());
   }

   @Override
   public void a(zz $$0) {
      this.g = true;
      zm.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(xc.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gnv $$1 = new gnv($$0.b(), $$0.e());
         fze.a(Objects.requireNonNullElseGet(this.f, gah::new), this.a, $$1, this.c, false, new gmw(this.h));
      }
   }

   @Override
   public void a(zs $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<gma.a> $$0 = this.m.iterator();

      while ($$0.hasNext()) {
         gma.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ag.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zj<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vx $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      l.warn("Client disconnected with reason: {}", $$0.a().getString());
   }

   @Override
   public void a(p $$0, q $$1) {
      $$1.a("Is Local", () -> String.valueOf(this.b.e()));
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$1.a("Server brand", () -> this.d);
      if (!this.i.isEmpty()) {
         q $$2 = $$0.a("Custom Server Details");
         this.i.forEach($$2::a);
      }
   }

   protected gaf b(vx $$0) {
      gaf $$1 = Objects.requireNonNullElseGet(this.f, () -> new gcx(new gah()));
      return (gaf)(this.c != null && this.c.e() ? new hrl($$1, k, $$0.a()) : new fzm($$1, k, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zj<? extends wo> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.m.add(new gma.a($$0, $$1, ag.c() + $$2.toMillis()));
      }
   }

   private gaf a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xc $$4) {
      gaf $$5 = this.a.z;
      return $$5 instanceof gma.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new gma.b(this.a, $$5, List.of(new gma.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zj<? extends wo> a, BooleanSupplier b, long c) {
   }

   class b extends fzd {
      private final List<gma.b.a> s;
      @Nullable
      private final gaf u;

      b(final frf $$0, @Nullable final gaf $$1, final List<gma.b.a> $$2, final boolean $$3, @Nullable final xc $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hob $$6 = $$0.af();
               if ($$5) {
                  if (gma.this.c != null) {
                     gma.this.c.a(gms.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     gma.this.b.a(xc.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (gma.this.c != null) {
                     gma.this.c.a(gms.a.b);
                  }
               }

               for (gma.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (gma.this.c != null) {
                  gmt.b(gma.this.c);
               }
            },
            $$3 ? xc.c("multiplayer.requiredTexturePrompt.line1") : xc.c("multiplayer.texturePrompt.line1"),
            gma.a($$3 ? xc.c("multiplayer.requiredTexturePrompt.line2").a(o.o, o.r) : xc.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xb.i : xb.f,
            $$3 ? xb.p : xb.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public gma.b a(frf $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xc $$5) {
         List<gma.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new gma.b.a($$1, $$2, $$3)).build();
         return gma.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
