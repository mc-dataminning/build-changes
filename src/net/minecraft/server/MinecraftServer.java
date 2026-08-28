package net.minecraft.server;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public abstract class MinecraftServer extends box<alf> implements ala, ep, AutoCloseable {
   private static final Logger k = LogUtils.getLogger();
   public static final String b = "vanilla";
   private static final float l = 0.8F;
   private static final int m = 100;
   private static final long n = 20L * aze.a / 20L;
   private static final int o = 20;
   private static final long p = 10L * aze.a;
   private static final int q = 100;
   private static final long r = 5L * aze.a;
   private static final long s = 10L * aze.b;
   private static final int t = 12;
   private static final int u = 5;
   private static final int v = 6000;
   private static final int w = 100;
   private static final int x = 3;
   public static final int c = 29999984;
   public static final dch d = new dch("Demo World", dca.a, false, bqa.c, false, new dbz(), dcy.c);
   public static final GameProfile e = new GameProfile(ac.e, "Anonymous Player");
   protected final eqc.c f;
   protected final eqf g;
   private final List<Runnable> y = Lists.newArrayList();
   private bof z = boe.a;
   private bmr A = this.z.f();
   private Consumer<bmq> B = $$0x -> this.aW();
   private Consumer<Path> C = $$0x -> {
   };
   private boolean D;
   @Nullable
   private MinecraftServer.c E;
   private boolean F;
   private final arj G;
   private final aqu H;
   @Nullable
   private ajj I;
   @Nullable
   private ajj.a J;
   private final aym K = aym.a();
   private final DataFixer L;
   private String M;
   private int N = -1;
   private final jq<akt> O;
   private final Map<akj<dcd>, aqk> P = Maps.newLinkedHashMap();
   private auh Q;
   private volatile boolean R = true;
   private boolean S;
   private int T;
   private int U = 6000;
   protected final Proxy h;
   private boolean V;
   private boolean W;
   private boolean X;
   private boolean Y;
   @Nullable
   private String Z;
   private int aa;
   private final long[] ab = new long[100];
   private long ac = 0L;
   @Nullable
   private KeyPair ad;
   @Nullable
   private GameProfile ae;
   private boolean af;
   private volatile boolean ag;
   private long ah;
   protected final ale i;
   private long ai;
   private final Thread aj;
   private long ak = ac.d();
   private long al = ac.d();
   private long am;
   private long an = ac.d();
   private long ao;
   private boolean ap;
   private final atf aq;
   private final alc ar = new alc(this);
   @Nullable
   private ept as;
   private final all at = new all();
   private final akz au;
   private boolean av;
   private float aw;
   private final Executor ax;
   @Nullable
   private String ay;
   private MinecraftServer.a az;
   private final emr aA;
   private final ald aB;
   protected final eqi j;
   private final cwa aC;
   private volatile boolean aD;

   public static <S extends MinecraftServer> S a(Function<Thread, S> $$0) {
      AtomicReference<S> $$1 = new AtomicReference<>();
      Thread $$2 = new Thread(() -> $$1.get().y(), "Server thread");
      $$2.setUncaughtExceptionHandler(($$0x, $$1x) -> k.error("Uncaught exception in server thread", $$1x));
      if (Runtime.getRuntime().availableProcessors() > 4) {
         $$2.setPriority(8);
      }

      S $$3 = (S)$$0.apply($$2);
      $$1.set($$3);
      $$2.start();
      return $$3;
   }

   public MinecraftServer(Thread $$0, eqc.c $$1, atf $$2, alh $$3, Proxy $$4, DataFixer $$5, ale $$6, aqu $$7) {
      super("Server");
      this.O = $$3.c();
      this.j = $$3.d();
      if (!this.O.a().d(lr.ba).d(dwa.b)) {
         throw new IllegalStateException("Missing Overworld dimension data");
      } else {
         this.h = $$4;
         this.aq = $$2;
         this.az = new MinecraftServer.a($$3.a(), $$3.b());
         this.i = $$6;
         if ($$6.f() != null) {
            $$6.f().a(this);
         }

         this.G = new arj(this);
         this.aB = new ald(this);
         this.H = $$7;
         this.f = $$1;
         this.g = $$1.g();
         this.L = $$5;
         this.au = new akz(this, this.az.b.a());
         jk<dff> $$8 = this.O.a().d(lr.f).q().a(this.j.K());
         this.aA = new emr($$3.a(), $$1, $$5, $$8);
         this.aj = $$0;
         this.ax = ac.g();
         this.aC = cwa.a(this.j.K());
      }
   }

   private void a(epw $$0) {
      $$0.a(this.aK().b(), "scoreboard");
   }

   protected abstract boolean e() throws IOException;

   protected void t_() {
      if (!bmx.f.c()) {
      }

      boolean $$0 = false;
      bna $$1 = bmx.f.e();
      this.j.a(this.getServerModName(), this.P().a());
      aqt $$2 = this.H.create(this.j.o().c(dbz.Z));
      this.a($$2);
      this.t();
      this.b($$2);
      if ($$1 != null) {
         $$1.finish();
      }

      if ($$0) {
         try {
            bmx.f.b();
         } catch (Throwable var5) {
            k.warn("Failed to stop JFR profiling", var5);
         }
      }
   }

   protected void t() {
   }

   protected void a(aqt $$0) {
      eqh $$1 = this.j.I();
      boolean $$2 = this.j.A();
      jw<dwa> $$3 = this.O.a().d(lr.ba);
      dyx $$4 = this.j.y();
      long $$5 = $$4.b();
      long $$6 = ddf.a($$5);
      List<dbq> $$7 = ImmutableList.of(new dyl(), new dyk(), new clq(), new cea(), new cmb($$1));
      dwa $$8 = $$3.a(dwa.b);
      aqk $$9 = new aqk(this, this.ax, this.f, $$1, dcd.h, $$8, $$0, $$2, $$6, $$7, true, null);
      this.P.put(dcd.h, $$9);
      epw $$10 = $$9.u();
      this.a($$10);
      this.as = new ept($$10);
      dty $$11 = $$9.C_();
      if (!$$1.n()) {
         try {
            a($$9, $$1, $$4.d(), $$2);
            $$1.c(true);
            if ($$2) {
               this.a(this.j);
            }
         } catch (Throwable var23) {
            o $$13 = o.a(var23, "Exception initializing level");

            try {
               $$9.a($$13);
            } catch (Throwable var22) {
            }

            throw new y($$13);
         }

         $$1.c(true);
      }

      this.ah().a($$9);
      if (this.j.E() != null) {
         this.aN().a(this.j.E(), this.bc());
      }

      bqk $$14 = $$9.L();

      for (Entry<akj<dwa>, dwa> $$15 : $$3.h()) {
         akj<dwa> $$16 = $$15.getKey();
         if ($$16 != dwa.b) {
            akj<dcd> $$17 = akj.a(lr.aZ, $$16.a());
            epv $$18 = new epv(this.j, $$1);
            aqk $$19 = new aqk(this, this.ax, this.f, $$18, $$17, $$15.getValue(), $$0, $$2, $$6, ImmutableList.of(), false, $$14);
            $$11.a(new dtw.a($$19.C_()));
            this.P.put($$17, $$19);
         }
      }

      $$11.a($$1.p());
   }

   private static void a(aqk $$0, eqh $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         $$1.a(ja.c.b(80), 0.0F);
      } else {
         aqi $$4 = $$0.l();
         dbk $$5 = new dbk($$4.i().b().a());
         int $$6 = $$4.g().a($$0);
         if ($$6 < $$0.I_()) {
            ja $$7 = $$5.l();
            $$6 = $$0.a(dxz.a.b, $$7.u() + 8, $$7.w() + 8);
         }

         $$1.a($$5.l().b(8, $$6, 8), 0.0F);
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = 0;
         int $$11 = -1;

         for (int $$12 = 0; $$12 < aye.h(11); $$12++) {
            if ($$8 >= -5 && $$8 <= 5 && $$9 >= -5 && $$9 <= 5) {
               ja $$13 = aqf.a($$0, new dbk($$5.e + $$8, $$5.f + $$9));
               if ($$13 != null) {
                  $$1.a($$13, 0.0F);
                  break;
               }
            }

            if ($$8 == $$9 || $$8 < 0 && $$8 == -$$9 || $$8 > 0 && $$8 == 1 - $$9) {
               int $$14 = $$10;
               $$10 = -$$11;
               $$11 = $$14;
            }

            $$8 += $$10;
            $$9 += $$11;
         }

         if ($$2) {
            $$0.H_().c(lr.aH).flatMap($$0x -> $$0x.b(ro.m)).ifPresent($$3x -> ((ear)$$3x.a()).a($$0, $$4.g(), $$0.z, $$1.a()));
         }
      }
   }

   private void a(eqi $$0) {
      $$0.a(bqa.a);
      $$0.d(true);
      eqh $$1 = $$0.I();
      $$1.b(false);
      $$1.a(false);
      $$1.a(1000000000);
      $$1.b(6000L);
      $$1.a(dca.d);
   }

   private void b(aqt $$0) {
      aqk $$1 = this.I();
      k.info("Preparing start region for dimension {}", $$1.af().a());
      ja $$2 = $$1.V();
      $$0.a(new dbk($$2));
      aqi $$3 = $$1.l();
      this.an = ac.d();
      $$1.a($$2, $$1.W());
      int $$4 = this.aM().c(dbz.Z);
      int $$5 = $$4 > 0 ? aye.h(aqt.a($$4)) : 0;

      while ($$3.b() < $$5) {
         this.an = ac.d() + s;
         this.v_();
      }

      this.an = ac.d() + s;
      this.v_();

      for (aqk $$6 : this.P.values()) {
         dby $$7 = $$6.u().b(dby.a(), "chunks");
         if ($$7 != null) {
            LongIterator $$8 = $$7.b().iterator();

            while ($$8.hasNext()) {
               long $$9 = $$8.nextLong();
               dbk $$10 = new dbk($$9);
               $$6.l().a($$10, true);
            }
         }
      }

      this.an = ac.d() + s;
      this.v_();
      $$0.b();
      this.bG();
   }

   public dca u_() {
      return this.j.k();
   }

   public boolean j() {
      return this.j.l();
   }

   public abstract int k();

   public abstract int l();

   public abstract boolean m();

   public boolean a(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = false;

      for (aqk $$4 : this.K()) {
         if (!$$0) {
            k.info("Saving chunks for level '{}'/{}", $$4, $$4.af().a());
         }

         $$4.a(null, $$1, $$4.e && !$$2);
         $$3 = true;
      }

      aqk $$5 = this.I();
      eqh $$6 = this.j.I();
      $$6.a($$5.C_().t());
      this.j.a(this.aN().a(this.bc()));
      this.f.a(this.bc(), this.j, this.ah().r());
      if ($$1) {
         for (aqk $$7 : this.K()) {
            k.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", $$7.l().a.n());
         }

         k.info("ThreadedAnvilChunkStorage: All dimensions are saved");
      }

      return $$3;
   }

   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean var4;
      try {
         this.aD = true;
         this.ah().h();
         var4 = this.a($$0, $$1, $$2);
      } finally {
         this.aD = false;
      }

      return var4;
   }

   @Override
   public void close() {
      this.v();
   }

   public void v() {
      if (this.z.e()) {
         this.aY();
      }

      k.info("Stopping server");
      this.ai().b();
      this.aD = true;
      if (this.Q != null) {
         k.info("Saving players");
         this.Q.h();
         this.Q.s();
      }

      k.info("Saving worlds");

      for (aqk $$0 : this.K()) {
         if ($$0 != null) {
            $$0.e = false;
         }
      }

      while (this.P.values().stream().anyMatch($$0x -> $$0x.l().a.f())) {
         this.an = ac.d() + aze.b;

         for (aqk $$1 : this.K()) {
            $$1.l().o();
            $$1.l().a(() -> true, false);
         }

         this.v_();
      }

      this.a(false, true, false);

      for (aqk $$2 : this.K()) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (IOException var5) {
               k.error("Exception closing the level", var5);
            }
         }
      }

      this.aD = false;
      this.az.close();

      try {
         this.f.close();
      } catch (IOException var4) {
         k.error("Failed to unlock level {}", this.f.f(), var4);
      }
   }

   public String w() {
      return this.M;
   }

   public void a_(String $$0) {
      this.M = $$0;
   }

   public boolean x() {
      return this.R;
   }

   public void a(boolean $$0) {
      this.R = false;
      if ($$0) {
         try {
            this.aj.join();
         } catch (InterruptedException var3) {
            k.error("Error while shutting down", var3);
         }
      }
   }

   protected void y() {
      try {
         if (!this.e()) {
            throw new IllegalStateException("Failed to initialize server");
         }

         this.an = ac.d();
         this.J = this.bC().orElse(null);
         this.I = this.bE();

         while (this.R) {
            long $$0;
            if (!this.D() && this.aB.a() && this.aB.d()) {
               $$0 = 0L;
               this.an = ac.d();
               this.ah = this.an;
            } else {
               $$0 = this.aB.h();
               long $$2 = ac.d() - this.an;
               if ($$2 > n + 20L * $$0 && this.an - this.ah >= p + 100L * $$0) {
                  long $$3 = $$2 / $$0;
                  k.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", $$2 / aze.b, $$3);
                  this.an += $$3 * $$0;
                  this.ah = this.an;
               }
            }

            boolean $$4 = $$0 == 0L;
            if (this.F) {
               this.F = false;
               this.E = new MinecraftServer.c(ac.d(), this.T);
            }

            this.an += $$0;
            this.bH();
            this.A.a("tick");
            this.a($$4 ? () -> false : this::bt);
            this.A.b("nextTickWait");
            this.ap = true;
            this.ao = Math.max(ac.d() + $$0, this.an);
            this.br();
            this.v_();
            this.bs();
            if ($$4) {
               this.aB.e();
            }

            this.A.c();
            this.bq();
            this.aU();
            this.ag = true;
            bmx.f.a(this.aw);
         }
      } catch (Throwable var46) {
         k.error("Encountered an unexpected exception", var46);
         o $$7 = a(var46);
         this.b($$7.g());
         File $$8 = new File(new File(this.C(), "crash-reports"), "crash-" + ac.f() + "-server.txt");
         if ($$7.a($$8)) {
            k.error("This crash report has been saved to: {}", $$8.getAbsolutePath());
         } else {
            k.error("We were unable to save this crash report to disk.");
         }

         this.a($$7);
      } finally {
         try {
            this.S = true;
            this.v();
         } catch (Throwable var44) {
            k.error("Exception stopping the server", var44);
         } finally {
            if (this.i.f() != null) {
               this.i.f().a();
            }

            this.i();
         }
      }
   }

   private void bq() {
      long $$0 = ac.d();
      if (this.g()) {
         this.f().a($$0 - this.ak);
      }

      this.ak = $$0;
   }

   private void br() {
      if (this.g()) {
         this.al = ac.d();
         this.am = 0L;
      }
   }

   private void bs() {
      if (this.g()) {
         blg $$0 = this.f();
         $$0.a(ac.d() - this.al - this.am, bli.c.ordinal());
         $$0.a(this.am, bli.d.ordinal());
      }
   }

   private static o a(Throwable $$0) {
      y $$1 = null;

      for (Throwable $$2 = $$0; $$2 != null; $$2 = $$2.getCause()) {
         if ($$2 instanceof y $$3) {
            $$1 = $$3;
         }
      }

      o $$4;
      if ($$1 != null) {
         $$4 = $$1.a();
         if ($$1 != $$0) {
            $$4.a("Wrapped in").a("Wrapping exception", $$0);
         }
      } else {
         $$4 = new o("Exception in server tick loop", $$0);
      }

      return $$4;
   }

   private boolean bt() {
      return this.bB() || ac.d() < (this.ap ? this.ao : this.an);
   }

   protected void v_() {
      this.bA();
      this.c(() -> !this.bt());
   }

   @Override
   public void z() {
      boolean $$0 = this.g();
      long $$1 = $$0 ? ac.d() : 0L;
      super.z();
      if ($$0) {
         this.am = this.am + (ac.d() - $$1);
      }
   }

   protected alf a(Runnable $$0) {
      return new alf(this.T, $$0);
   }

   protected boolean a(alf $$0) {
      return $$0.a() + 3 < this.T || this.bt();
   }

   @Override
   public boolean A() {
      boolean $$0 = this.bu();
      this.ap = $$0;
      return $$0;
   }

   private boolean bu() {
      if (super.A()) {
         return true;
      } else {
         if (this.aB.a() || this.bt()) {
            for (aqk $$0 : this.K()) {
               if ($$0.l().d()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected void b(alf $$0) {
      this.aT().d("runTask");
      super.d($$0);
   }

   private Optional<ajj.a> bC() {
      Optional<Path> $$0 = Optional.of(this.c("server-icon.png").toPath())
         .filter($$0x -> Files.isRegularFile($$0x))
         .or(() -> this.f.j().filter($$0x -> Files.isRegularFile($$0x)));
      return $$0.flatMap($$0x -> {
         try {
            BufferedImage $$1 = ImageIO.read($$0x.toFile());
            Preconditions.checkState($$1.getWidth() == 64, "Must be 64 pixels wide");
            Preconditions.checkState($$1.getHeight() == 64, "Must be 64 pixels high");
            ByteArrayOutputStream $$2 = new ByteArrayOutputStream();
            ImageIO.write($$1, "PNG", $$2);
            return Optional.of(new ajj.a($$2.toByteArray()));
         } catch (Exception var3) {
            k.error("Couldn't load server icon", var3);
            return Optional.empty();
         }
      });
   }

   public Optional<Path> B() {
      return this.f.j();
   }

   public File C() {
      return new File(".");
   }

   public void a(o $$0) {
   }

   public void i() {
   }

   public boolean D() {
      return false;
   }

   public void a(BooleanSupplier $$0) {
      long $$1 = ac.d();
      this.T++;
      this.aB.m();
      this.b($$0);
      if ($$1 - this.ai >= r) {
         this.ai = $$1;
         this.I = this.bE();
      }

      this.U--;
      if (this.U <= 0) {
         this.U = this.bD();
         k.debug("Autosave started");
         this.A.a("save");
         this.b(true, false, false);
         this.A.c();
         k.debug("Autosave finished");
      }

      this.A.a("tallying");
      long $$2 = ac.d() - $$1;
      int $$3 = this.T % 100;
      this.ac = this.ac - this.ab[$$3];
      this.ac += $$2;
      this.ab[$$3] = $$2;
      this.aw = this.aw * 0.8F + (float)$$2 / (float)aze.b * 0.19999999F;
      this.a($$1);
      this.A.c();
   }

   private void a(long $$0) {
      if (this.g()) {
         this.f().a(ac.d() - $$0, bli.b.ordinal());
      }
   }

   private int bD() {
      float $$1;
      if (this.aB.a()) {
         long $$0 = this.aR() + 1L;
         $$1 = (float)aze.a / (float)$$0;
      } else {
         $$1 = this.aB.f();
      }

      int $$3 = 300;
      return Math.max(100, (int)($$1 * 300.0F));
   }

   public void E() {
      int $$0 = this.bD();
      if ($$0 < this.U) {
         this.U = $$0;
      }
   }

   protected abstract blg f();

   public abstract boolean g();

   private ajj bE() {
      ajj.b $$0 = this.bF();
      return new ajj(wu.a(this.Z), Optional.of($$0), Optional.of(ajj.c.a()), Optional.ofNullable(this.J), this.aB());
   }

   private ajj.b bF() {
      List<aql> $$0 = this.Q.t();
      int $$1 = this.N();
      if (this.ao()) {
         return new ajj.b($$1, $$0.size(), List.of());
      } else {
         int $$2 = Math.min($$0.size(), 12);
         ObjectArrayList<GameProfile> $$3 = new ObjectArrayList($$2);
         int $$4 = aye.a(this.K, 0, $$0.size() - $$2);

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            aql $$6 = $$0.get($$4 + $$5);
            $$3.add($$6.Z() ? $$6.fX() : e);
         }

         ac.c($$3, this.K);
         return new ajj.b($$1, $$0.size(), $$3);
      }
   }

   public void b(BooleanSupplier $$0) {
      this.ah().t().forEach($$0x -> $$0x.c.f());
      this.A.a("commandFunctions");
      this.aF().b();
      this.A.b("levels");

      for (aqk $$1 : this.K()) {
         this.A.a(() -> $$1 + " " + $$1.af().a());
         if (this.T % 20 == 0) {
            this.A.a("timeSync");
            this.b($$1);
            this.A.c();
         }

         this.A.a("tick");

         try {
            $$1.a($$0);
         } catch (Throwable var6) {
            o $$3 = o.a(var6, "Exception ticking world");
            $$1.a($$3);
            throw new y($$3);
         }

         this.A.c();
         this.A.c();
      }

      this.A.b("connection");
      this.ai().c();
      this.A.b("players");
      this.Q.d();
      if (aa.aX && this.aB.i()) {
         sz.a.b();
      }

      this.A.b("server gui refresh");

      for (int $$4 = 0; $$4 < this.y.size(); $$4++) {
         this.y.get($$4).run();
      }

      this.A.b("send chunks");

      for (aql $$5 : this.Q.t()) {
         $$5.c.g.a($$5);
         $$5.c.g();
      }

      this.A.c();
   }

   private void b(aqk $$0) {
      this.Q.a(new afe($$0.Z(), $$0.aa(), $$0.ab().b(dbz.l)), $$0.af());
   }

   public void F() {
      this.A.a("timeSync");

      for (aqk $$0 : this.K()) {
         this.b($$0);
      }

      this.A.c();
   }

   public boolean G() {
      return true;
   }

   public void b(Runnable $$0) {
      this.y.add($$0);
   }

   protected void b(String $$0) {
      this.ay = $$0;
   }

   public boolean H() {
      return !this.aj.isAlive();
   }

   public File c(String $$0) {
      return new File(this.C(), $$0);
   }

   public final aqk I() {
      return this.P.get(dcd.h);
   }

   @Nullable
   public aqk a(akj<dcd> $$0) {
      return this.P.get($$0);
   }

   public Set<akj<dcd>> J() {
      return this.P.keySet();
   }

   public Iterable<aqk> K() {
      return this.P.values();
   }

   @Override
   public String L() {
      return aa.b().c();
   }

   @Override
   public int M() {
      return this.Q.m();
   }

   @Override
   public int N() {
      return this.Q.n();
   }

   public String[] O() {
      return this.Q.e();
   }

   @DontObfuscate
   public String getServerModName() {
      return "vanilla";
   }

   public ab b(ab $$0) {
      $$0.a("Server Running", () -> Boolean.toString(this.R));
      if (this.Q != null) {
         $$0.a("Player Count", () -> this.Q.m() + " / " + this.Q.n() + "; " + this.Q.t());
      }

      $$0.a("Active Data Packs", () -> atf.a(this.aq.f()));
      $$0.a("Available Data Packs", () -> atf.a(this.aq.c()));
      $$0.a("Enabled Feature Flags", () -> cox.d.b(this.j.K()).stream().map(akk::toString).collect(Collectors.joining(", ")));
      $$0.a("World Generation", () -> this.j.B().toString());
      $$0.a("World Seed", () -> String.valueOf(this.j.y().b()));
      if (this.ay != null) {
         $$0.a("Server Id", () -> this.ay);
      }

      return this.a($$0);
   }

   public abstract ab a(ab var1);

   public ayd P() {
      return ayd.a("vanilla", this::getServerModName, "Server", MinecraftServer.class);
   }

   @Override
   public void a(wu $$0) {
      k.info($$0.getString());
   }

   public KeyPair Q() {
      return this.ad;
   }

   public int R() {
      return this.N;
   }

   public void a(int $$0) {
      this.N = $$0;
   }

   @Nullable
   public GameProfile S() {
      return this.ae;
   }

   public void b(@Nullable GameProfile $$0) {
      this.ae = $$0;
   }

   public boolean T() {
      return this.ae != null;
   }

   protected void U() {
      k.info("Generating keypair");

      try {
         this.ad = axb.b();
      } catch (axc var2) {
         throw new IllegalStateException("Failed to generate key pair", var2);
      }
   }

   public void a(bqa $$0, boolean $$1) {
      if ($$1 || !this.j.r()) {
         this.j.a(this.j.l() ? bqa.d : $$0);
         this.bG();
         this.ah().t().forEach(this::c);
      }
   }

   public int b(int $$0) {
      return $$0;
   }

   private void bG() {
      for (aqk $$0 : this.K()) {
         $$0.b(this.V(), this.ab());
      }
   }

   public void b(boolean $$0) {
      this.j.d($$0);
      this.ah().t().forEach(this::c);
   }

   private void c(aql $$0) {
      epy $$1 = $$0.dP().A_();
      $$0.c.b(new aca($$1.q(), $$1.r()));
   }

   public boolean V() {
      return this.j.q() != bqa.a;
   }

   public boolean W() {
      return this.af;
   }

   public void c(boolean $$0) {
      this.af = $$0;
   }

   public Optional<MinecraftServer.b> X() {
      return Optional.empty();
   }

   public boolean Y() {
      return this.X().filter(MinecraftServer.b::d).isPresent();
   }

   public abstract boolean n();

   public abstract int o();

   public boolean Z() {
      return this.V;
   }

   public void d(boolean $$0) {
      this.V = $$0;
   }

   public boolean aa() {
      return this.W;
   }

   public void e(boolean $$0) {
      this.W = $$0;
   }

   public boolean ab() {
      return true;
   }

   public boolean ac() {
      return true;
   }

   public abstract boolean p();

   public boolean ad() {
      return this.X;
   }

   public void f(boolean $$0) {
      this.X = $$0;
   }

   public boolean ae() {
      return this.Y;
   }

   public void g(boolean $$0) {
      this.Y = $$0;
   }

   public abstract boolean q();

   @Override
   public String af() {
      return this.Z;
   }

   public void d(String $$0) {
      this.Z = $$0;
   }

   public boolean ag() {
      return this.S;
   }

   public auh ah() {
      return this.Q;
   }

   public void a(auh $$0) {
      this.Q = $$0;
   }

   public abstract boolean r();

   public void a(dca $$0) {
      this.j.a($$0);
   }

   public arj ai() {
      return this.G;
   }

   public boolean aj() {
      return this.ag;
   }

   public boolean ak() {
      return false;
   }

   public boolean a(@Nullable dca $$0, boolean $$1, int $$2) {
      return false;
   }

   public int al() {
      return this.T;
   }

   public int am() {
      return 16;
   }

   public boolean a(aqk $$0, ja $$1, cmh $$2) {
      return false;
   }

   public boolean an() {
      return true;
   }

   public boolean ao() {
      return false;
   }

   public Proxy ap() {
      return this.h;
   }

   public int aq() {
      return this.aa;
   }

   public void c(int $$0) {
      this.aa = $$0;
   }

   public MinecraftSessionService ar() {
      return this.i.c();
   }

   @Nullable
   public ayr as() {
      return this.i.a();
   }

   public GameProfileRepository at() {
      return this.i.e();
   }

   @Nullable
   public aud au() {
      return this.i.f();
   }

   @Nullable
   public ajj av() {
      return this.I;
   }

   public void aw() {
      this.ai = 0L;
   }

   public int ax() {
      return 29999984;
   }

   @Override
   public boolean ay() {
      return super.ay() && !this.ag();
   }

   @Override
   public void c(Runnable $$0) {
      if (this.ag()) {
         throw new RejectedExecutionException("Server already shutting down");
      } else {
         super.c($$0);
      }
   }

   @Override
   public Thread az() {
      return this.aj;
   }

   public int aA() {
      return 256;
   }

   public boolean aB() {
      return false;
   }

   public long aC() {
      return this.an;
   }

   public DataFixer aD() {
      return this.L;
   }

   public int a(@Nullable aqk $$0) {
      return $$0 != null ? $$0.ab().c(dbz.s) : 10;
   }

   public akx aE() {
      return this.az.b.e();
   }

   public akz aF() {
      return this.au;
   }

   public CompletableFuture<Void> a(Collection<String> $$0) {
      CompletableFuture<Void> $$1 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> $$0.stream().map(this.aq::c).filter(Objects::nonNull).map(atc::f).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose($$0x -> {
            atk $$1x = new atn(asi.b, $$0x);
            return akv.a($$1x, this.O, this.j.K(), this.n() ? er.a.b : er.a.c, this.l(), this.ax, this).whenComplete(($$1xx, $$2) -> {
               if ($$2 != null) {
                  $$1x.close();
               }
            }).thenApply($$1xx -> new MinecraftServer.a($$1x, $$1xx));
         })
         .thenAcceptAsync($$1x -> {
            this.az.close();
            this.az = $$1x;
            this.aq.b($$0);
            dcy $$2 = new dcy(a(this.aq, true), this.j.K());
            this.j.a($$2);
            this.az.b.g();
            this.ah().h();
            this.ah().u();
            this.au.a(this.az.b.a());
            this.aA.a(this.az.a);
         }, this);
      if (this.bw()) {
         this.c($$1::isDone);
      }

      return $$1;
   }

   public static dcy a(atf $$0, dcy $$1, boolean $$2, boolean $$3) {
      dbr $$4 = $$1.a();
      cov $$5 = $$2 ? cov.a() : $$1.b();
      cov $$6 = $$2 ? cox.d.a() : $$1.b();
      $$0.a();
      if ($$3) {
         return a($$0, List.of("vanilla"), $$5, false);
      } else {
         Set<String> $$7 = Sets.newLinkedHashSet();

         for (String $$8 : $$4.a()) {
            if ($$0.d($$8)) {
               $$7.add($$8);
            } else {
               k.warn("Missing data pack {}", $$8);
            }
         }

         for (atc $$9 : $$0.c()) {
            String $$10 = $$9.g();
            if (!$$4.b().contains($$10)) {
               cov $$11 = $$9.e();
               boolean $$12 = $$7.contains($$10);
               if (!$$12 && $$9.l().a()) {
                  if ($$11.a($$6)) {
                     k.info("Found new data pack {}, loading it automatically", $$10);
                     $$7.add($$10);
                  } else {
                     k.info("Found new data pack {}, but can't load it due to missing features {}", $$10, cox.a($$6, $$11));
                  }
               }

               if ($$12 && !$$11.a($$6)) {
                  k.warn("Pack {} requires features {} that are not enabled for this world, disabling pack.", $$10, cox.a($$6, $$11));
                  $$7.remove($$10);
               }
            }
         }

         if ($$7.isEmpty()) {
            k.info("No datapacks selected, forcing vanilla");
            $$7.add("vanilla");
         }

         return a($$0, $$7, $$5, true);
      }
   }

   private static dcy a(atf $$0, Collection<String> $$1, cov $$2, boolean $$3) {
      $$0.b($$1);
      a($$0, $$2);
      dbr $$4 = a($$0, $$3);
      cov $$5 = $$0.e().c($$2);
      return new dcy($$4, $$5);
   }

   private static void a(atf $$0, cov $$1) {
      cov $$2 = $$0.e();
      cov $$3 = $$1.d($$2);
      if (!$$3.b()) {
         Set<String> $$4 = new ObjectArraySet($$0.d());

         for (atc $$5 : $$0.c()) {
            if ($$3.b()) {
               break;
            }

            if ($$5.l() == atg.d) {
               String $$6 = $$5.g();
               cov $$7 = $$5.e();
               if (!$$7.b() && $$7.b($$3) && $$7.a($$1)) {
                  if (!$$4.add($$6)) {
                     throw new IllegalStateException("Tried to force '" + $$6 + "', but it was already enabled");
                  }

                  k.info("Found feature pack ('{}') for requested feature, forcing to enabled", $$6);
                  $$3 = $$3.d($$7);
               }
            }
         }

         $$0.b($$4);
      }
   }

   private static dbr a(atf $$0, boolean $$1) {
      Collection<String> $$2 = $$0.d();
      List<String> $$3 = ImmutableList.copyOf($$2);
      List<String> $$4 = $$1 ? $$0.b().stream().filter($$1x -> !$$2.contains($$1x)).toList() : List.of();
      return new dbr($$3, $$4);
   }

   public void a(eq $$0) {
      if (this.aO()) {
         auh $$1 = $$0.l().ah();
         aup $$2 = $$1.i();

         for (aql $$4 : Lists.newArrayList($$1.t())) {
            if (!$$2.a($$4.fX())) {
               $$4.c.b(wu.c("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public atf aG() {
      return this.aq;
   }

   public er aH() {
      return this.az.b.d();
   }

   public eq aI() {
      aqk $$0 = this.I();
      return new eq(this, $$0 == null ? evz.b : evz.a($$0.V()), evy.a, $$0, 4, "Server", wu.b("Server"), this, null);
   }

   @Override
   public boolean l_() {
      return true;
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public abstract boolean U_();

   public cyk aJ() {
      return this.az.b.c();
   }

   public alc aK() {
      return this.ar;
   }

   public ept aL() {
      if (this.as == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.as;
      }
   }

   public dbz aM() {
      return this.I().ab();
   }

   public all aN() {
      return this.at;
   }

   public boolean aO() {
      return this.av;
   }

   public void h(boolean $$0) {
      this.av = $$0;
   }

   public float aP() {
      return this.aw;
   }

   public ald aQ() {
      return this.aB;
   }

   public long aR() {
      return this.ac / (long)Math.min(100, Math.max(this.T, 1));
   }

   public long[] aS() {
      return this.ab;
   }

   public int c(GameProfile $$0) {
      if (this.ah().f($$0)) {
         auj $$1 = this.ah().k().b($$0);
         if ($$1 != null) {
            return $$1.a();
         } else if (this.a($$0)) {
            return 4;
         } else if (this.T()) {
            return this.ah().v() ? 4 : 0;
         } else {
            return this.k();
         }
      } else {
         return 0;
      }
   }

   public bmr aT() {
      return this.A;
   }

   public abstract boolean a(GameProfile var1);

   public void a(Path $$0) throws IOException {
   }

   private void b(Path $$0) {
      Path $$1 = $$0.resolve("levels");

      try {
         for (Entry<akj<dcd>, aqk> $$2 : this.P.entrySet()) {
            akk $$3 = $$2.getKey().a();
            Path $$4 = $$1.resolve($$3.b()).resolve($$3.a());
            Files.createDirectories($$4);
            $$2.getValue().a($$4);
         }

         this.d($$0.resolve("gamerules.txt"));
         this.e($$0.resolve("classpath.txt"));
         this.c($$0.resolve("stats.txt"));
         this.f($$0.resolve("threads.txt"));
         this.a($$0.resolve("server.properties.txt"));
         this.g($$0.resolve("modules.txt"));
      } catch (IOException var7) {
         k.warn("Failed to save debug report", var7);
      }
   }

   private void c(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         $$1.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.bx()));
         $$1.write(String.format(Locale.ROOT, "average_tick_time: %f\n", this.aP()));
         $$1.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.ab)));
         $$1.write(String.format(Locale.ROOT, "queue: %s\n", ac.g()));
      }
   }

   private void d(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         final List<String> $$2 = Lists.newArrayList();
         final dbz $$3 = this.aM();
         dbz.a(new dbz.c() {
            @Override
            public <T extends dbz.g<T>> void a(dbz.e<T> $$0, dbz.f<T> $$1) {
               $$2.add(String.format(Locale.ROOT, "%s=%s\n", $$0.a(), $$3.a($$0)));
            }
         });

         for (String $$4 : $$2) {
            $$1.write($$4);
         }
      }
   }

   private void e(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         String $$2 = System.getProperty("java.class.path");
         String $$3 = System.getProperty("path.separator");

         for (String $$4 : Splitter.on($$3).split($$2)) {
            $$1.write($$4);
            $$1.write("\n");
         }
      }
   }

   private void f(Path $$0) throws IOException {
      ThreadMXBean $$1 = ManagementFactory.getThreadMXBean();
      ThreadInfo[] $$2 = $$1.dumpAllThreads(true, true);
      Arrays.sort($$2, Comparator.comparing(ThreadInfo::getThreadName));

      try (Writer $$3 = Files.newBufferedWriter($$0)) {
         for (ThreadInfo $$4 : $$2) {
            $$3.write($$4.toString());
            $$3.write(10);
         }
      }
   }

   private void g(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         List<ayf.a> $$2;
         try {
            $$2 = Lists.newArrayList(ayf.a());
         } catch (Throwable var7) {
            k.warn("Failed to list native modules", var7);
            return;
         }

         $$2.sort(Comparator.comparing($$0x -> $$0x.a));

         for (ayf.a $$5 : $$2) {
            $$1.write($$5.toString());
            $$1.write(10);
         }
      }
   }

   private void bH() {
      if (this.D) {
         this.z = bod.a(new boh(ac.c, this.n()), ac.c, ac.h(), new boj("server"), this.B, $$0 -> {
            this.h(() -> this.b($$0.resolve("server")));
            this.C.accept($$0);
         });
         this.D = false;
      }

      this.A = bmu.a(this.z.f(), bmu.a("Server"));
      this.z.c();
      this.A.a();
   }

   public void aU() {
      this.A.b();
      this.z.d();
   }

   public boolean aV() {
      return this.z.e();
   }

   public void a(Consumer<bmq> $$0, Consumer<Path> $$1) {
      this.B = $$1x -> {
         this.aW();
         $$0.accept($$1x);
      };
      this.C = $$1;
      this.D = true;
   }

   public void aW() {
      this.z = boe.a;
   }

   public void aX() {
      this.z.a();
   }

   public void aY() {
      this.z.b();
      this.A = this.z.f();
   }

   public Path a(eqa $$0) {
      return this.f.a($$0);
   }

   public boolean aZ() {
      return true;
   }

   public emr ba() {
      return this.aA;
   }

   public eqi bb() {
      return this.j;
   }

   public jx.b bc() {
      return this.O.a();
   }

   public jq<akt> bd() {
      return this.O;
   }

   public aku.b be() {
      return this.az.b.b();
   }

   public arp a(aql $$0) {
      return arp.a;
   }

   public aqm b(aql $$0) {
      return (aqm)(this.W() ? new aqb($$0) : new aqm($$0));
   }

   @Nullable
   public dca bf() {
      return null;
   }

   public atu bg() {
      return this.az.a;
   }

   public boolean bh() {
      return this.aD;
   }

   public boolean bi() {
      return this.F || this.E != null;
   }

   public void bj() {
      this.F = true;
   }

   public bmq bk() {
      if (this.E == null) {
         return bmm.a;
      } else {
         bmq $$0 = this.E.a(ac.d(), this.T);
         this.E = null;
         return $$0;
      }
   }

   public int bl() {
      return 1000000;
   }

   public void a(wu $$0, wq.a $$1, @Nullable String $$2) {
      String $$3 = $$1.a($$0).getString();
      if ($$2 != null) {
         k.info("[{}] {}", $$2, $$3);
      } else {
         k.info("{}", $$3);
      }
   }

   public wp bm() {
      return wp.a;
   }

   public boolean bn() {
      return true;
   }

   public void a(aql $$0, ble $$1) {
   }

   public boolean bo() {
      return false;
   }

   public void a(dbk $$0) {
   }

   public void b(dbk $$0) {
   }

   public cwa bp() {
      return this.aC;
   }

   static record a(atk a, akv b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.close();
      }
   }

   public static record b(UUID a, String b, String c, boolean d, @Nullable wu e) {
   }

   static class c {
      final long a;
      final int b;

      c(long $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      bmq a(final long $$0, final int $$1) {
         return new bmq() {
            @Override
            public List<bmt> a(String $$0x) {
               return Collections.emptyList();
            }

            @Override
            public boolean a(Path $$0x) {
               return false;
            }

            @Override
            public long a() {
               return c.this.a;
            }

            @Override
            public int b() {
               return c.this.b;
            }

            @Override
            public long c() {
               return $$0;
            }

            @Override
            public int d() {
               return $$1;
            }

            @Override
            public String e() {
               return "";
            }
         };
      }
   }
}
