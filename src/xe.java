import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record xe(xf l, xf m) {
   public static final Codec<xe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xf.a.fieldOf("chat").forGetter(xe::a), xf.a.fieldOf("narration").forGetter(xe::b)).apply($$0, xe::new)
   );
   public static final zg<wt, xe> b = zg.a(xf.b, xe::a, xf.b, xe::b, xe::new);
   public static final zg<wt, jq<xe>> c = ze.a(lz.aH, b);
   public static final xf d = xf.a("chat.type.text");
   public static final alh<xe> e = a("chat");
   public static final alh<xe> f = a("say_command");
   public static final alh<xe> g = a("msg_command_incoming");
   public static final alh<xe> h = a("msg_command_outgoing");
   public static final alh<xe> i = a("team_msg_command_incoming");
   public static final alh<xe> j = a("team_msg_command_outgoing");
   public static final alh<xe> k = a("emote_command");

   private static alh<xe> a(String $$0) {
      return alh.a(lz.aH, ali.b($$0));
   }

   public static void a(qy<xe> $$0) {
      $$0.a(e, new xe(d, xf.a("chat.type.text.narrate")));
      $$0.a(f, new xe(xf.a("chat.type.announcement"), xf.a("chat.type.text.narrate")));
      $$0.a(g, new xe(xf.b("commands.message.display.incoming"), xf.a("chat.type.text.narrate")));
      $$0.a(h, new xe(xf.c("commands.message.display.outgoing"), xf.a("chat.type.text.narrate")));
      $$0.a(i, new xe(xf.d("chat.type.team.text"), xf.a("chat.type.text.narrate")));
      $$0.a(j, new xe(xf.d("chat.type.team.sent"), xf.a("chat.type.text.narrate")));
      $$0.a(k, new xe(xf.a("chat.type.emote"), xf.a("chat.type.emote")));
   }

   public static xe.a a(alh<xe> $$0, bue $$1) {
      return a($$0, $$1.dX().H_(), $$1.S_());
   }

   public static xe.a a(alh<xe> $$0, ew $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static xe.a a(alh<xe> $$0, ke $$1, xi $$2) {
      kd<xe> $$3 = $$1.e(lz.aH);
      return new xe.a($$3.b($$0), $$2);
   }

   public xf a() {
      return this.l;
   }

   public xf b() {
      return this.m;
   }

   public static record a(jq<xe> b, xi c, Optional<xi> d) {
      public static final zg<wt, xe.a> a = zg.a(xe.c, xe.a::a, xk.d, xe.a::b, xk.e, xe.a::c, xe.a::new);

      a(jq<xe> $$0, xi $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xi a(xi $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xi b(xi $$0) {
         return this.b.a().b().a($$0, this);
      }

      public xe.a c(xi $$0) {
         return new xe.a(this.b, this.c, Optional.of($$0));
      }

      public jq<xe> a() {
         return this.b;
      }

      public xi b() {
         return this.c;
      }

      public Optional<xi> c() {
         return this.d;
      }
   }
}
