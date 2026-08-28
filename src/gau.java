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

public abstract class gau implements zq {
   private static final xd l = xd.c("disconnect.lost");
   private static final Logger m = LogUtils.getLogger();
   protected final fib a;
   protected final vx b;
   @Nullable
   protected final gbl c;
   @Nullable
   protected String d;
   protected final hbw e;
   @Nullable
   protected final fpt f;
   protected boolean g;
   @Deprecated(
      forRemoval = true
   )
   protected final boolean h;
   private final List<gau.a> n = new ArrayList<>();
   protected final Map<alb, byte[]> i;
   protected Map<String, String> j;
   protected alt k;

   protected gau(fib $$0, vx $$1, gbb $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.i = $$2.h();
      this.h = $$2.j();
      this.j = $$2.k();
      this.k = $$2.l();
   }

   @Override
   public void a(zk $$0, Exception $$1) {
      m.error("Failed to handle packet {}", $$0, $$1);
      zq.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.k.a(alt.b.a).map(alt.a::c);
      if (this.h) {
         this.b.a(new vz(xd.c("disconnect.packetError"), $$2, $$3));
      }
   }

   @Override
   public vz a(xd $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.k.a(alt.b.a).map(alt.a::c);
      return new vz($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zk $$0, Throwable $$1) {
      o $$2 = o.a($$1, "Packet handling error");
      zn.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ad.f() + "-client.txt");
      Optional<alt.a> $$5 = this.k.a(alt.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, y.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zk<?> $$0) {
      return zq.super.a($$0) ? true : this.g && ($$0 instanceof zz || $$0 instanceof aaa);
   }

   @Override
   public void a(zu $$0) {
      this.a(new aag($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zv $$0) {
      zn.a($$0, this, this.a);
      this.b(new aah($$0.b()));
   }

   @Override
   public void a(zr $$0) {
      aan $$1 = $$0.b();
      if (!($$1 instanceof aao)) {
         zn.a($$0, this, this.a);
         if ($$1 instanceof aal $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aan var1);

   @Override
   public void a(zx $$0) {
      zn.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aai($$1, aai.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         gbl.a $$5 = this.c != null ? this.c.b() : gbl.a.c;
         if ($$5 != gbl.a.c && (!$$4 || $$5 != gbl.a.b)) {
            this.a.ae().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zw $$0) {
      zn.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ae().a($$0x), () -> this.a.ae().e());
   }

   static xd a(xd $$0, @Nullable xd $$1) {
      return (xd)($$1 == null ? $$0 : xd.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(abu $$0) {
      zn.a($$0, this, this.a);
      this.b.a(new abx($$0.b(), this.i.get($$0.b())));
   }

   @Override
   public void a(zz $$0) {
      zn.a($$0, this, this.a);
      this.i.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zs $$0) {
      zn.a($$0, this, this.a);
      this.j = $$0.b();
   }

   @Override
   public void a(zy $$0) {
      zn.a($$0, this, this.a);
      List<alt.c> $$1 = $$0.b();
      Builder<alt.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (alt.c $$3 : $$1) {
         try {
            URI $$4 = ad.a($$3.b());
            $$2.add(new alt.a($$3.a(), $$4));
         } catch (Exception var7) {
            m.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.k = new alt($$2.build());
   }

   @Override
   public void a(aaa $$0) {
      this.g = true;
      zn.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(xd.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gco $$1 = new gco($$0.b(), $$0.e());
         fos.a(Objects.requireNonNullElseGet(this.f, fpv::new), this.a, $$1, this.c, false, new gbp(this.i));
      }
   }

   @Override
   public void a(zt $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<gau.a> $$0 = this.n.iterator();

      while ($$0.hasNext()) {
         gau.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ad.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zk<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vz $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      m.warn("Client disconnected with reason: {}", $$0.a().getString());
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$1.a("Server brand", () -> this.d);
      if (!this.j.isEmpty()) {
         p $$2 = $$0.a("Custom Server Details");
         this.j.forEach($$2::a);
      }
   }

   protected fpt b(vz $$0) {
      fpt $$1 = Objects.requireNonNullElseGet(this.f, () -> new fsi(new fpv()));
      return (fpt)(this.c != null && this.c.e() ? new hcp($$1, l, $$0.a()) : new fpa($$1, l, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zk<? extends wp> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.n.add(new gau.a($$0, $$1, ad.c() + $$2.toMillis()));
      }
   }

   private fpt a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xd $$4) {
      fpt $$5 = this.a.z;
      return $$5 instanceof gau.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new gau.b(this.a, $$5, List.of(new gau.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zk<? extends wp> a, BooleanSupplier b, long c) {
   }

   class b extends foq {
      private final List<gau.b.a> s;
      @Nullable
      private final fpt u;

      b(final fib $$0, @Nullable final fpt $$1, final List<gau.b.a> $$2, final boolean $$3, @Nullable final xd $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               gzg $$6 = $$0.ae();
               if ($$5) {
                  if (gau.this.c != null) {
                     gau.this.c.a(gbl.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     gau.this.b.a(xd.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (gau.this.c != null) {
                     gau.this.c.a(gbl.a.b);
                  }
               }

               for (gau.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (gau.this.c != null) {
                  gbm.b(gau.this.c);
               }
            },
            $$3 ? xd.c("multiplayer.requiredTexturePrompt.line1") : xd.c("multiplayer.texturePrompt.line1"),
            gau.a($$3 ? xd.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : xd.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xc.i : xc.f,
            $$3 ? xc.p : xc.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public gau.b a(fib $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xd $$5) {
         List<gau.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new gau.b.a($$1, $$2, $$3)).build();
         return gau.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
