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

public abstract class fzc implements zm {
   private static final wz l = wz.c("disconnect.lost");
   private static final Logger m = LogUtils.getLogger();
   protected final fgo a;
   protected final vt b;
   @Nullable
   protected final fzt c;
   @Nullable
   protected String d;
   protected final gvs e;
   @Nullable
   protected final fod f;
   protected boolean g;
   @Deprecated(
      forRemoval = true
   )
   protected final boolean h;
   private final List<fzc.a> n = new ArrayList<>();
   protected final Map<akr, byte[]> i;
   protected Map<String, String> j;
   protected alj k;

   protected fzc(fgo $$0, vt $$1, fzj $$2) {
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
   public void a(zg $$0, Exception $$1) {
      m.error("Failed to handle packet {}", $$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.k.a(alj.b.a).map(alj.a::c);
      if (this.h) {
         this.b.a(new vv(wz.c("disconnect.packetError"), $$2, $$3));
      }
   }

   @Override
   public vv a(wz $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.k.a(alj.b.a).map(alj.a::c);
      return new vv($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zg $$0, Throwable $$1) {
      o $$2 = o.a($$1, "Packet handling error");
      zj.a($$2, this, $$0);
      Path $$3 = this.a.p.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ad.f() + "-client.txt");
      Optional<alj.a> $$5 = this.k.a(alj.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, y.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zg<?> $$0) {
      return zm.super.a($$0) ? true : this.g && ($$0 instanceof zv || $$0 instanceof zw);
   }

   @Override
   public void a(zq $$0) {
      this.a(new aac($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zr $$0) {
      zj.a($$0, this, this.a);
      this.b(new aad($$0.b()));
   }

   @Override
   public void a(zn $$0) {
      aaj $$1 = $$0.b();
      if (!($$1 instanceof aak)) {
         zj.a($$0, this, this.a);
         if ($$1 instanceof aah $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aaj var1);

   @Override
   public void a(zt $$0) {
      zj.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aae($$1, aae.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         fzt.a $$5 = this.c != null ? this.c.b() : fzt.a.c;
         if ($$5 != fzt.a.c && (!$$4 || $$5 != fzt.a.b)) {
            this.a.ae().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zs $$0) {
      zj.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ae().a($$0x), () -> this.a.ae().e());
   }

   static wz a(wz $$0, @Nullable wz $$1) {
      return (wz)($$1 == null ? $$0 : wz.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(abp $$0) {
      zj.a($$0, this, this.a);
      this.b.a(new abs($$0.b(), this.i.get($$0.b())));
   }

   @Override
   public void a(zv $$0) {
      zj.a($$0, this, this.a);
      this.i.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zo $$0) {
      zj.a($$0, this, this.a);
      this.j = $$0.b();
   }

   @Override
   public void a(zu $$0) {
      zj.a($$0, this, this.a);
      List<alj.c> $$1 = $$0.b();
      Builder<alj.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (alj.c $$3 : $$1) {
         try {
            URI $$4 = ad.a($$3.b());
            $$2.add(new alj.a($$3.a(), $$4));
         } catch (Exception var7) {
            m.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.k = new alj($$2.build());
   }

   @Override
   public void a(zw $$0) {
      this.g = true;
      zj.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(wz.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gax $$1 = new gax($$0.b(), $$0.e());
         fnc.a(Objects.requireNonNullElseGet(this.f, fof::new), this.a, $$1, this.c, false, new fzy(this.i));
      }
   }

   @Override
   public void a(zp $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<fzc.a> $$0 = this.n.iterator();

      while ($$0.hasNext()) {
         fzc.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ad.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zg<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vv $$0) {
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

   protected fod b(vv $$0) {
      fod $$1 = Objects.requireNonNullElseGet(this.f, () -> new fqt(new fof()));
      return (fod)(this.c != null && this.c.e() ? new gwm($$1, l, $$0.a()) : new fnk($$1, l, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zg<? extends wl> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.n.add(new fzc.a($$0, $$1, ad.c() + $$2.toMillis()));
      }
   }

   private fod a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable wz $$4) {
      fod $$5 = this.a.y;
      return $$5 instanceof fzc.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new fzc.b(this.a, $$5, List.of(new fzc.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zg<? extends wl> a, BooleanSupplier b, long c) {
   }

   class b extends fnb {
      private final List<fzc.b.a> s;
      @Nullable
      private final fod u;

      b(final fgo $$0, @Nullable final fod $$1, final List<fzc.b.a> $$2, final boolean $$3, @Nullable final wz $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               gtc $$6 = $$0.ae();
               if ($$5) {
                  if (fzc.this.c != null) {
                     fzc.this.c.a(fzt.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     fzc.this.b.a(wz.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (fzc.this.c != null) {
                     fzc.this.c.a(fzt.a.b);
                  }
               }

               for (fzc.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (fzc.this.c != null) {
                  fzu.b(fzc.this.c);
               }
            },
            $$3 ? wz.c("multiplayer.requiredTexturePrompt.line1") : wz.c("multiplayer.texturePrompt.line1"),
            fzc.a($$3 ? wz.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : wz.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? wy.i : wy.f,
            $$3 ? wy.p : wy.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public fzc.b a(fgo $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable wz $$5) {
         List<fzc.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new fzc.b.a($$1, $$2, $$3)).build();
         return fzc.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
