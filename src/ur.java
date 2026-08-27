import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ur(us j, us k) {
   public static final Codec<ur> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(us.a.fieldOf("chat").forGetter(ur::a), us.a.fieldOf("narration").forGetter(ur::b)).apply($$0, ur::new)
   );
   public static final us b = us.a("chat.type.text");
   public static final agl<ur> c = a("chat");
   public static final agl<ur> d = a("say_command");
   public static final agl<ur> e = a("msg_command_incoming");
   public static final agl<ur> f = a("msg_command_outgoing");
   public static final agl<ur> g = a("team_msg_command_incoming");
   public static final agl<ur> h = a("team_msg_command_outgoing");
   public static final agl<ur> i = a("emote_command");

   private static agl<ur> a(String $$0) {
      return agl.a(kd.as, new agm($$0));
   }

   public static void a(oz<ur> $$0) {
      $$0.a(c, new ur(b, us.a("chat.type.text.narrate")));
      $$0.a(d, new ur(us.a("chat.type.announcement"), us.a("chat.type.text.narrate")));
      $$0.a(e, new ur(us.b("commands.message.display.incoming"), us.a("chat.type.text.narrate")));
      $$0.a(f, new ur(us.c("commands.message.display.outgoing"), us.a("chat.type.text.narrate")));
      $$0.a(g, new ur(us.d("chat.type.team.text"), us.a("chat.type.text.narrate")));
      $$0.a(h, new ur(us.d("chat.type.team.sent"), us.a("chat.type.text.narrate")));
      $$0.a(i, new ur(us.a("chat.type.emote"), us.a("chat.type.emote")));
   }

   public static ur.a a(agl<ur> $$0, bkv $$1) {
      return a($$0, $$1.dN().I_(), $$1.Q_());
   }

   public static ur.a a(agl<ur> $$0, du $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static ur.a a(agl<ur> $$0, it $$1, uv $$2) {
      is<ur> $$3 = $$1.d(kd.as);
      return $$3.e($$0).a($$2);
   }

   public ur.a a(uv $$0) {
      return new ur.a(this, $$0);
   }

   public us a() {
      return this.j;
   }

   public us b() {
      return this.k;
   }

   public static record a(ur a, uv b, @Nullable uv c) {
      a(ur $$0, uv $$1) {
         this($$0, $$1, null);
      }

      public uv a(uv $$0) {
         return this.a.a().a($$0, this);
      }

      public uv b(uv $$0) {
         return this.a.b().a($$0, this);
      }

      public ur.a c(uv $$0) {
         return new ur.a(this.a, this.b, $$0);
      }

      public ur.b a(it $$0) {
         is<ur> $$1 = $$0.d(kd.as);
         return new ur.b($$1.a(this.a), this.b, this.c);
      }
   }

   public static record b(int a, uv b, @Nullable uv c) {
      public b(ty $$0) {
         this($$0.n(), $$0.m(), $$0.c(ty::m));
      }

      public void a(ty $$0) {
         $$0.c(this.a);
         $$0.a(this.b);
         $$0.a(this.c, ty::a);
      }

      public Optional<ur.a> a(it $$0) {
         is<ur> $$1 = $$0.d(kd.as);
         ur $$2 = $$1.a(this.a);
         return Optional.ofNullable($$2).map($$0x -> new ur.a($$0x, this.b, this.c));
      }
   }
}
